import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ArrayListExercise {
    public static void main(String[] args) {
      // Exercise 1: Array List Basic Operations
  
      // 1a. Create an ArrayList of integers.
      List<Integer> arr = new ArrayList<>();
      // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
      arr.add(10);
      arr.add(20);
      arr.add(30);
      arr.add(40);
      arr.add(50);
      // 1c. Print all the elements in the list.
      System.out.println(arr); // [10, 20, 30, 40, 50]
      // 1d. Remove the number 30 from the list.
      arr.remove(arr.indexOf(30));
      // 1e. Print the size of the list.
      System.out.println(arr.size()); // 4

      // Exercise 2: Search and Update
  
      // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
      // "Orange".
      List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango", "Orange"));
      // 2b. Check if "Grapes" exists in the list.
      // 2c. If it doesn’t exist, add it to the list.
      if (!(fruits.contains("Grapes"))) {
        fruits.add("Grapes");
      }
      // 2d. Update "Mango" to "Peach".
      fruits.replaceAll(fruit -> "Mango".equals(fruit) ? "Peach" : fruit);
      // fruits.set(fruits.indexOf("Mango"),"Peach");
      // 2e. Print the final list.
      System.out.println(fruits); // [Apple, Banana, Peach, Orange, Grapes]
      
      // Exercise 3: Remove Duplicates
  
      // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
      List<Integer> arr2 = new ArrayList<>(Arrays.asList( 10, 20, 10, 30, 40, 20, 50));
      // 3b. Remove duplicates from the list using a HashSet.
      Set<Integer> arr3 = new HashSet<>();
      arr3.addAll(arr2);
      // for (Integer i : integers3) {
      //   integerSet3.add(i);
      // }
      // 3c. Print the list after removing duplicates.
      System.out.println(arr3); // [50, 20, 40, 10, 30]
      
      // Exercise 4: HashSet Basic Operations
  
      // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
      Set<String> countryNames = new HashSet<>(Arrays.asList("USA", "India", "China", "Japan"));
      // 4b. Add "Canada" to the set.
      countryNames.add("Canada");
      // 4c. Add "India" again. Print the result.
      countryNames.add("India");
      // 4d. Print all elements in the set.
      System.out.println(countryNames); // [Canada, USA, China, Japan, India]
  
      // Exercise 5: Check the numbers
  
      // 5a. Create a HashSet of integers: 1.1, 2.2, 3.3, 4.4, 5.5
      Set<Double> numbers = new HashSet<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
      // 5b. Check if the set contains the number 3.3
      System.out.println(numbers.contains(3.3)); // true
      // 5c. Remove the number 2.2 from the set.
      numbers.remove(2.2);
      // 5d. Print the size of the set.
      System.out.println(numbers.size()); // 4

      // Exercise 6: Intersection of Sets

      // 6a. Create two HashSets:
      // 6b. Set 1: 10, 20, 30, 40
      Set<Integer> set1 = new HashSet<>(Arrays.asList(10, 20, 30, 40));
      // 6c. Set 2: 30, 40, 50, 60
      Set<Integer> set2 = new HashSet<>(Arrays.asList(30, 40, 50, 60));
      // 6d. Find the common numbers of the two sets.
      set1.retainAll(set2); // Disadvantage of retainAll(), the original is altered
      // 6e. Print the resulting set.
      System.out.println(set1); // [40, 30]

      // Exercise 7: Convert HashSet to ArrayList
  
      // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
      Set<String> names = new HashSet<>(Arrays.asList("Cherry", "Steve", "Chole", "Jenny", "Vicky"));
      // 7b. Convert the HashSet to an ArrayList.
      List<String> names2 = new ArrayList<>(names);
      // 7c. Print the converted list.
      System.out.println(names2); // [Chole, Vicky, Cherry, Steve, Jenny]
  
      // Exercise 8: ArrayList of Students
      // 8a. Create an ArrayList to store Student objects.
      // Add the following students:
      // ID: 1, Name: Alice
      // ID: 2, Name: Bob
      // ID: 3, Name: Charlie
      List<Student> students = new ArrayList<>();
      students.add(new Student(1,"Alice"));
      students.add(new Student(2,"Bob"));
      students.add(new Student(3,"Charlie"));
      // 8b. Iterate over the ArrayList and print each student's details.
      for (Student stu : students) {
        System.out.println(stu);
      }
      // System.out.println(students.toString());
      // 8c. Remove the student Bob.
      students.remove(new Student(2, "Bob"));
      // 8d. Write a static method to search for a student by ID and return their name. If the student is
      // not found,
      // return "Student not found".
      System.out.println(Student.getName(students, 2)); // "Student not found"
      System.out.println(Student.getName(students, 3)); // "Charlie"

      // int targetId = 1;
      // String studentName = "Student Not Found";
      // for (Student s : students)
      // if (s.getId() == targetId) {
      //   studentName = s.getName();
      //   break;
      // }
      // System.out.println(studentName);

      // 8e. Create another ArrayList to store student with name starts with 'A'
      List<Student> students1 = new ArrayList<>();
      for (Student s1 : students)
      if (s1.getName().startsWith("A")) {
        students1.add(s1);
      }
      System.out.println(students1); // [[ID: 1, Name: Alice]]

      // Exercise 9: HashSet of Students
      // 9a. Create two HashSets of Student objects:
      // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
      Set<Student> students9a1 = new HashSet<>(Arrays.asList(new Student("Alice",1), new Student("Bob",2), new Student("Charlie",3)));
      // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
      Set<Student> students9a2 = new HashSet<>(Arrays.asList(new Student("Bob",2), new Student("Charlie",3), new Student("David",4)));
      // 9b. Find the common students of the two sets
      List<Student> commonStudents = new LinkedList<>();
      for (Student stu : students9a2) {
        if (students9a1.contains(stu)) {
        commonStudents.add(stu);
        }
      }
      // 9c. Print the result.
      System.out.println(commonStudents);
      // [Student[id=2,name=Bob], Student[id=3,name=Charlie]]
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

      public static String getName(List<Student> students, int id) {
        for (Student stu : students) {
          if (stu.getId() == id)
            return stu.getName();
        }
        return "Student not found";
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
