public class SelfExercise1 {
    public static void main(String[] args) {
    /* Expected output:
    * The index of the last character of e is 18.
    */
        String str = "Welcome to Middle-earth!"; // You should not change this line
        char target = 'e';
        int lastIndex = -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
            lastIndex = i;}
        } if (lastIndex != -1) {
            System.out.println("The index of the last character of " + target + " is " + lastIndex + ".");
        } else {
            System.out.println("Not Found.");
        }
        
            

        




    }
}
