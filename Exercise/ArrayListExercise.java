import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class ArrayListExercise {
    public static void main(String[] args) {
      // Exercise 1: Array List Basic Operations
  
      // 1a. Create an ArrayList of integers.
      // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
      // 1c. Print all the elements in the list.
      // 1d. Remove the number 30 from the list.
      // 1e. Print the size of the list.

      ArrayList<Integer> arr = new ArrayList<>();
      arr.add(10);
      arr.add(20);
      arr.add(30);
      arr.add(40);
      arr.add(50);
      System.out.println(arr); // [10, 20, 30, 40, 50]
      arr.remove(arr.indexOf(30));
      System.out.println(arr.size()); // 4

      // Exercise 2: Search and Update
  
      // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
      // "Orange".
      // 2b. Check if "Grapes" exists in the list.
      // 2c. If it doesn’t exist, add it to the list.
      // 2d. Update "Mango" to "Peach".
      // 2e. Print the final list.

      ArrayList<String> fruits = new ArrayList<>();
      fruits.add("Apple");
      fruits.add("Banana");
      fruits.add("Mango");
      fruits.add("Orange");

      if (!(fruits.contains("Grapes"))) {
        fruits.add("Grapes");
      }

      fruits.set(fruits.indexOf("Mango"),"Peach");
      
      System.out.println(fruits); // [Apple, Banana, Peach, Orange, Grapes]
      

      // Exercise 3: Remove Duplicates
  
      // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
      // 3b. Remove duplicates from the list using a HashSet.
      // 3c. Print the list after removing duplicates.

      ArrayList<Integer> arr2 = new ArrayList<>();
      arr2.add(10);
      arr2.add(20);
      arr2.add(10);
      arr2.add(30);
      arr2.add(40);
      arr2.add(20);
      arr2.add(50);

      HashSet<Integer> arr3 = new HashSet<>();
      arr3.addAll(arr2);

      
      System.out.println(arr3); // [50, 20, 40, 10, 30]
      
  
  
      // Exercise 4: HashSet Basic Operations
  
      // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
      // 4b. Add "Canada" to the set.
      // 4c. Add "India" again. Print the result.
      // 4d. Print all elements in the set.

      HashSet<String> countryNames = new HashSet<>();
      countryNames.add("USA");
      countryNames.add("India");
      countryNames.add("China");
      countryNames.add("Japan");
      countryNames.add("Canada");
      countryNames.add("India");
      System.out.println(countryNames); // [Canada, USA, China, Japan, India]
  
      // Exercise 5: Check the numbers
  
      // 5a. Create a HashSet of integers: 1.1, 2.2, 3.3, 4.4, 5.5
      // 5b. Check if the set contains the number 3.3
      // 5c. Remove the number 2.2 from the set.
      // 5d. Print the size of the set.

      HashSet<Double> arr5 = new HashSet<>();
      arr5.add(1.1);
      arr5.add(2.2);
      arr5.add(3.3);
      arr5.add(4.4);
      arr5.add(5.5);

      boolean containsNumber = false;
      if (arr5.contains(3.3)) {
        containsNumber = true;
      }
      System.out.println(containsNumber); // true

      arr5.remove(2.2);

      System.out.println(arr.size()); // 4

      // Exercise 6: Intersection of Sets
  
      // 6a. Create two HashSets:
      // 6b. Set 1: 10, 20, 30, 40
      // 6c. Set 2: 30, 40, 50, 60
      // 6d. Find the common numbers of the two sets.
      // 6e. Print the resulting set.

      HashSet<Integer> set1 = new HashSet<>();
      set1.add(10);
      set1.add(20);
      set1.add(30);
      set1.add(40);

      HashSet<Integer> set2 = new HashSet<>();
      set2.add(30);
      set2.add(40);
      set2.add(50);
      set2.add(60);

      ArrayList<Integer> set11 = new ArrayList<>();
      set11.addAll(set1);

      ArrayList<Integer> set22 = new ArrayList<>();
      set22.addAll(set2);

      HashSet<Integer> set3 = new HashSet<>();

      for (int i = 0; i < set11.size(); i++) {
        for (int j = 0; j < set22.size(); j++)
        if (set11.toArray()[i] == set22.toArray()[j]) {
          set3.add((Integer) set11.toArray()[i]);
        }
      }

      System.out.println(set3); // [40, 30]

      // Exercise 7: Convert HashSet to ArrayList
  
      // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
      // 7b. Convert the HashSet to an ArrayList.
      // 7c. Print the converted list.

      HashSet<String> names = new HashSet<>();
      names.add("Cherry");
      names.add("Steve");
      names.add("Chole");
      names.add("Jenny");
      names.add("Vicky");

      ArrayList<String> names2 = new ArrayList<>();
      names2.addAll(names);
      System.out.println(names2); // [Chole, Vicky, Cherry, Steve, Jenny]
  
      // Exercise 8: ArrayList of Students
      // 8a. Create an ArrayList to store Student objects.
      // Add the following students:
      // ID: 1, Name: Alice
      // ID: 2, Name: Bob
      // ID: 3, Name: Charlie
      // 8b. Iterate over the ArrayList and print each student's details.
      // 8c. Remove the student Bob.
      // 8d. Write a static method to search for a student by ID and return their name. If the student is
      // not found,
      // return "Student not found".
      // 8e. Create another ArrayList to store student with name starts with 'A'
  
      // Exercise 9: HashSet of Students
      // 9a. Create two HashSets of Student objects:
      // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
      // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
      // 9b. Find the common students of the two sets
      // 9c. Print the result.
      ArrayList<Student> students = new ArrayList<>();
      students.add(new Student(1,"Alice"));
      students.add(new Student(2,"Bob"));
      students.add(new Student(3,"Charlie"));
      System.out.println(students.toString());
      students.remove(new Student(2, "Bob"));

      int targetId = 1;
      String studentName = "Student Not Found";
      for (Student s : students)
      if (s.getId() == targetId) {
        studentName = s.getName();
        break;
      }
      System.out.println(studentName);

      ArrayList<Student> students1 = new ArrayList<>();
      for (Student s1 : students)
      if (s1.getName().startsWith("A")) {
        students1.add(s1);
      }
      System.out.println(students1); // [[ID: 1, Name: Alice]]

      HashSet<Student> students3 = new HashSet<>();
      students3.add(new Student("Alice",1));
      students3.add(new Student("Bob",2));
      students3.add(new Student("Charlie",3));

      HashSet<Student> students4 = new HashSet<>();
      students4.add(new Student("Bob",2));
      students4.add(new Student("Charlie",3));
      students4.add(new Student("David",4));

      ArrayList<Student> set33 = new ArrayList<>();
      set33.addAll(students3);

      ArrayList<Student> set44 = new ArrayList<>();
      set44.addAll(students4);

      HashSet<Student> set5 = new HashSet<>();

      for (int i = 0; i < set33.size(); i++) {
        for (int j = 0; j < set44.size(); j++) {
          if (set33.toArray()[i].equals(set44.toArray()[j]))
          set5.add((ArrayListExercise.Student) set33.toArray()[i]);
        }
      }

      System.out.println(set5); // [[ID: 2, Name: Bob], [ID: 3, Name: Charlie]]


    }
  
    public static class Student {
      private int id;
      private String name;
  
      // Constructor
      public Student(int id, String name) {
        this.id = id;
        this.name = name;
      }

      public Student(String name, int id) {
        this.name = name;
        this.id = id;
      }

      @Override
      public String toString() {
        return "[ID: " + this.id + ", Name: " + this.name + "]";
      }

      public int getId() {
        return this.id;
      }

      public String getName() {
        return this.name;
      }


      @Override
      public boolean equals(Object obj) {
        if (this == obj) {
          return true;
        } if (!(obj instanceof Student)) {
          return false;
        } Student student = (Student) obj;
        return Objects.equals(this.id, student.getId()) &&
          Objects.equals(this.name, student.getName());
      }

      @Override
      public int hashCode() {
        return Objects.hash(this.id, this.name);
      }

      // getter, setter, etc.
      


    }
  }
