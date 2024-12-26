import java.util.Arrays;

public class Person { // blueprint - define a Person (class = file)
    //  attributes
    private String name;
    private int age;
    private String emailAddress;
    private char gender; // F/M

    // constructor (Not Method)
    // constructor is to create object
    public Person(String name, int age, String emailAddress, char gender) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
        this.gender = gender;
    }

    public int getNameLength() {
        return this.name.length();
    }

    public boolean isElderly() {
        return this.age > 65;
    }

    public boolean isMale() {
        return this.gender == 'M' ? true : false;
    }

    // getter (instance = object)
    // instance Method is able to return self value
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    // setter
    // void -> return type (return nothing)
    public void setAge(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public static void main(String[] args) { // static Method

    Person p1 = new Person("Jimmy", 5, "jimmy@gmail.com", 'M');
    System.out.println(p1.getName()); // jimmy
    System.out.println(p1.getAge()); // 5
    System.out.println(p1.getEmailAddress()); // jimmy@gmail.com
    System.out.println(p1.isMale()); // true
    System.out.println(p1.getName().length()); // 5
    System.out.println(p1.getNameLength()); // 5
    System.out.println(p1.isElderly()); // false
    p1.setAge(66);
    System.out.println(p1.isElderly()); // true

    Person p2 = new Person("lucas", 17, "lucas@gmail.com", 'M');
    System.out.println(p2.getName()); // lucas
    System.out.println(p2.getAge()); // 17
    System.out.println(p2.getEmailAddress()); // lucas@gmail.com

    Person p3 = p2;
    System.out.println(p3.getName()); // lucas
    System.out.println(p3.getAge()); // 17
    System.out.println(p3.getEmailAddress()); // lucas@gmail.com

    p2.setAge(30);
    System.out.println(p2.getAge()); // 30
    System.out.println(p3.getAge()); // 30

    Person[] persons = new Person[] {p1, p2, new Person("dicky", 19, "dicky.gmail.com",'M')};
    for (Person p : persons) {
        System.out.println(p.getName() + "," + p.getAge() + "," + p.getEmailAddress()); 
    } 

    }  
}
