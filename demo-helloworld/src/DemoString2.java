public class DemoString2 {
    public static void main(String[] args) {
        String password = "S3hi5lPswd4z";
        char lastChar = password.charAt(password.length() -1);
        System.out.println(lastChar); // z

        String password2 = "sdBdjFf835435Zd34";
        char lastChar2 = password2.charAt(password2.length() -1);
        System.out.println(password2.length()); // 17
        System.out.println(lastChar2); // 4
        
        String name = "VenturenixLAB, Java";
        System.out.println(name.replaceAll("E", "*").toUpperCase().concat("!!!")); // VENTURENIXLAB, JAVA!!!
        System.out.println(name.toUpperCase().replaceAll("E", "*").concat("!!!")); // V*NTUR*NIXLAB, JAVA!!!
        // replaceAll() is for replacing strings only, not char.
        System.out.println(name.toUpperCase().replace('E', '*').concat("!!!")); // V*NTUR*NIXLAB, JAVA!!!
    
        String str = "apple, bananna, cherry, date";
        String[] fruits = str.split(",\s*");

        for (String fruit : fruits) {
            System.out.println(fruit);
            // apple
            // bananna
            // cherry
            // date
        
        String str2 = "one, two, three, four, five";
        String[] parts = str2.split(", ", 3); // limit: maximum number of split substrings

        for (String part : parts) {
            System.out.println(part);
            // one
            // two
            // three, four, five

        }
        
        
        
        
        }






    }
}
