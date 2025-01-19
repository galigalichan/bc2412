public class DemoCheckedException {
    // 2 Types Exception:
    // 1) Checked Exception - Exception.class (Parent class) (Compile-time)
    // 2) Unchecked Exception - RuntimeException.class (Child class) (Runtime)

    // Define Checked Exception
    public static class BusinessException extends Exception {

    }

    // Define Unchecked Exception
    public static class BusinessRuntimeException extends RuntimeException {
        
    }

    // Who is the caller of main() method
    // JVM (Java Virtual Machine) call this main method

    public static void main(String[] args) {
        int sum = 0;
        try {
            sum = sum(10,null); // throw checked exception (compile time)
            System.out.println("sum=" + sum);
        } catch (BusinessException e) {
            System.out.println("x and y cannot be null.");
        }

        // For runtime exception, you can catch or not catch (Syntax Perspective)
        sum = sum2(10,null); // Syntax OK, but the exception still exits
        try {
            sum = sum2(10,null); // throw unchecked exception (runtime)
            System.out.println("sum=" + sum);
        } catch (BusinessRuntimeException e) {
            System.out.println("x and y cannot be null.");
        }
    }

    public static int sum(Integer x, Integer y) throws BusinessException {
        if (x == null || y == null)
        throw new BusinessException();
        return x.intValue() + y.intValue();
    }

    public static int sum2(Integer x, Integer y) {
        if (x == null || y == null)
        throw new BusinessRuntimeException();
        return x.intValue() + y.intValue();
    }
}
