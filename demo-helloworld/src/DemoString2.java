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
    




    }
}
