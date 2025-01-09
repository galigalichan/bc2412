public class Abc {
    public static void main(String[] args) { // (object - cannot be deleted)
        int x = 3;
        System.out.println(x);
        int[] arr = new int[3];

        String person = "vincent";
        int personAge = 18;

        String person2 = "lucas";
        int personAge2 = 17;
        
        String[] names = new String[] {"Vincent", "lucas"};
        int[] ages = new int[] {18, 17};
        
        Person p1 = new Person("vincent", 18, "vincent@gmail.com", 'M');
        System.out.println(p1.getName()); // vincent
        System.out.println(p1.getAge()); // 18
        System.out.println(p1.getEmailAddress()); // vincent@gmail.com

        Person p2 = new Person("lucas", 17, "lucas@gmail.com",'M');
        System.out.println(p2.getName()); // lucas
        System.out.println(p2.getAge()); // 17
        System.out.println(p2.getEmailAddress()); // lucas@gmail.com

        Person p3 = p2;
        System.out.println(p3.getAge()); // 17
        System.out.println(p3.getName()); // lucas
        
        p2.setAge(30);
        System.out.println(p2.getAge()); // 30
        System.out.println(p3.getAge()); // 30
    

        Person[] persons = new Person[] {p1, p2, new Person("dicky", 19, "dicky.gmail.com",'M')};
        for (Person p : persons) {
            System.out.println(p.getName() + "," + p.getAge() + "," + p.getEmailAddress()); 
            // name, age, email
        }

        // String s2 = p2;
        // Sting s3 = new Integer(23);



        String s1 = "hello";
        String [] strings = new String[] {s1, "world"};

        double d1 = Double.valueOf(0.6f);
        System.out.println(d1);



    }
}
