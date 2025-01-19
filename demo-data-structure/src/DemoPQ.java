import java.util.Comparator;
import java.util.PriorityQueue;

public class DemoPQ {

    public static class Person {
        private int age;

        public Person(int age) {
            this.age = age;
        }

        public int getAge() {
            return this.age;

        }

        public boolean isElderly() {
            return this.age >= 65;
        }

        @Override
        public String toString() {
          return "Person[" //
              + "age=" + this.age //
              + "]";
        }
    }

    public static class SortByElderly implements Comparator<DemoPQ.Person> {
        // Early return
        @Override
        public int compare(DemoPQ.Person p1, DemoPQ.Person p2) {
        if (p1.isElderly())
            return -1;
        if (p2.isElderly())
            return 1;
        return -1; // base return
        }
        }


    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Vincent");
        System.out.println(pq); // [Vincent]
        pq.add("Oscar");
        System.out.println(pq); // [Oscar, Vincent]
        pq.add("Lucas");
        System.out.println(pq); // [Lucas, Vincent, Oscar] // no ordering
        System.out.println(pq.size()); // 3

        // For poll(), ordering -> String natural order
        System.out.println(pq.poll()); // Lucas
        System.out.println(pq.poll()); // Oscar
        System.out.println(pq.poll()); // Vincent

        // The real ordering occurs in poll()

        PriorityQueue<Person> pq2 = new PriorityQueue<>(new SortByElderly());
        pq2.add(new Person(44));
        pq2.add(new Person(20));
        pq2.add(new Person(70));
        pq2.add(new Person(40));
        System.out.println(pq2.poll()); // Person[age=70]
        pq2.add(new Person(80));
        System.out.println(pq2.poll()); // Person[age=80]
        System.out.println(pq2.poll()); // Person[age=40]
        System.out.println(pq2.poll()); // Person[age=20]
        System.out.println(pq2.poll()); // Person[age=44]
        
    }
}