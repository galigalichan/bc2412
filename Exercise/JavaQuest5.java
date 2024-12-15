public class JavaQuest5 {
    /* Expected output:
    * The index of the last character of c is 11
    */
   public static void main(String[] args) {
     String str = "coding bootcamp."; // You should not change this line
     char target = 'z'; // Update this target to test the logic
     int lastIndex = str.lastIndexOf(target);
 
     // if not found, print "Not Found."
     // code here ...
    
    if (lastIndex >=0) {
    System.out.println("The index of the last character of c is " + lastIndex);
    } else {
    System.out.println("Not Found.");
    }

   }
}
