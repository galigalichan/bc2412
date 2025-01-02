import java.util.Arrays;

public class Student {
    private long id;
    private int score;
    private int candiesReceived;

    // Question 1:
    // 20 candies -> distribute among students according to their score
    // Rule: Every round of distribution, Above 80 score -> 2 candies; Above 60 - 79 score -> 1 candy
    // Student 1: 67 score
    // Student 2: 89 score
    // Student 3: 50 score
    // Student 4: 99 score
    // Student 5: 60 score
    // Student 6: 59 score
    
    // Expected Output:    
    // Student 1 has 4 candies (1,1,1,1)
    // Student 2 has 6 candies (2,2,2,0)
    // Student 3 has 0 candies (0,0,0,0)
    // Student 4 has 6 candies (2,2,2,0)
    // Student 5 has 4 candies (1,1,1,1)
    // Student 6 has 0 candies (0,0,0)

    // Tips: static -> candyCount (While Loop)

    //Constructor
    public Student(long id, int score) {
        this.id = id;
        this.score = score;
        this.candiesReceived = 0;
    }

    public long getId() {
        return this.id;
    }

    public int getScore() {
        return this.score;
    }

    public int getCandiesReceived() {
        return this.candiesReceived;
    }


    public void addOneCandy() {
        this.candiesReceived++;
    }

    public void addTwoCandy() {
        this.candiesReceived += 2;
    }


    public static void main(String[] args) {
        Student s1 = new Student(1L,67);
        Student s2 = new Student(2L,89);
        Student s3 = new Student(3L,50);
        Student s4 = new Student(4L,99);
        Student s5 = new Student(5L,60);
        Student s6 = new Student(6L,59);
        Student[] students = new Student[] {s1, s2, s3, s4, s5, s6};

        while (Candy.candyCount > 0) {
        for (Student s : students) {
        if (Candy.candyCount - 2 >= 0 && s.getScore() >= 80) {
            s.addTwoCandy();
            Candy.candyCount -= 2;
        } else if (Candy.candyCount - 1 >= 0 && s.getScore() >= 60 && s.getScore() < 80) {
            s.addOneCandy();
            Candy.candyCount--;
        }
        }
        }

        for (Student s : students) {
            System.out.println("Student " + s.getId() + " has " + s.getCandiesReceived());

        }

    }

}
