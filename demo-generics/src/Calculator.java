public class Calculator<T extends Number> { // Byte, Short, Integer, Long, Float, Double // at least the variable is a number, not an object which cannot be added to each other.
    // if we achieve the same purpose without generics,
    // ByteCalculator.class
    // ShortCalculator.class
    // IntegerCalculator.class
    // LongCalculator.class
    // FloatCalculator.class
    // DoubleCalculator.class
    // NumberCalculator.class
    
    private T x;
    private T y;

    public Calculator(T x, T y) {
        this.x = x;
        this.y = y;
    }

    // Allow overflow
    public Number sum() { // (short) Short -> long -> Long
        if (this.x instanceof Byte && this.y instanceof Byte) {
            return (byte) this.x + (byte) this.y; // byte + byte -> int -> Integer
        } else if (this.x instanceof Short && this.y instanceof Short) {
            return (short) this.x + (short) this.y;
        } else if (this.x instanceof Integer && this.y instanceof Integer) {
            return (int) this.x + (int) this.y;
        } else if (this.x instanceof Long && this.y instanceof Long) {
            return (long) this.x + (long) this.y;
        } else if (this.x instanceof Float && this.y instanceof Float) {
            return (float) this.x + (float) this.y;
        } else if (this.x instanceof Double && this.y instanceof Double) {
            return (double) this.x + (double) this.y;
        }
    }

    public static void main(String[] args) {
        Calculator<Byte> calculator = new Calculator<>(Byte.valueOf("10"), Byte.valueOf("20"));
        Calculator<Number> calculator2 = new Calculator<>(Byte.valueOf("10"), Short.valueOf("20")); // dangerous when the parent Number is involved. There can be tons of combinations.
        // private Number x;
        // private Number y;
    }
}
