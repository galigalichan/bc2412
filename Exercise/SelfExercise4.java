public class SelfExercise4 {
    public static void main(String[] args) {
        Integer intNum1 = 127; // Integer cache is used (Range from -128n to 127)
        Integer intNum2 = 127; // Integer cache is used (reusing the same object)
        System.out.println(intNum1 == intNum2); // true

        Integer intNum3 = 150;
        Integer intNum4 = 150;
        System.out.println(intNum3 == intNum4); // false // Integer cache is not used (out of the cache range: -128 to 127)
    
        Boolean bool1 = true; // Boolean cache is used (only two instances: Boolean.TRUE and Boolean.FALSE)
        Boolean bool2 = true; // Boolean cache is used (reusing the same object)
        System.out.println(bool1 == bool2); // true

        Boolean bool3 = new Boolean(true); // Boolean cache is not used (deprecated constructor)
        Boolean bool4 = new Boolean(true); // Boolean cache is not used (reusing the same object)
        System.out.println(bool3 == bool4); // false
    
    
    }
}
