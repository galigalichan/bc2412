public class JavaQuest2 {
    /**
 * Expected Output:
 * 
 * a > 9
 * str length < 27
 */
// Primitive types and operators
    public static void main(String[] args) {
      int a = 10;
      if (a == 9) {
        System.out.println("a is equals to 9");
      } else if (a >= 0 && a <=8 ) {
        System.out.println("a is between 0 and 8");
      } else if (a >9) {
        System.out.println("a > 9");
      } else {
        System.out.println("a < 0");
      }
  
      String str = "I love Java. I love coding";
      if (str.length() == 27) {
        System.out.println("str length=27");
      } else if (str.length() < 27) {
        System.out.println("str length < 27");
      } else if (str.length() > 27) {
        System.out.println("str length > 27");
      }
    }
  }

