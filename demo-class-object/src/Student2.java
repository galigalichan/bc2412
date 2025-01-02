import java.util.Arrays;

public class Student2 {
    // Question 2:
    // Candy.class has attribute color (RED, BLUE, YELLOW)
    // Student2.class to store his own candies

    // 20 candies -> distribue to students according to their score
    // Rule: Every round of distribution, Above 80 score -> RED; between 60 - 79 score -> BLUE, else YELLOW

    // Student 1: 67 score
    // Student 2: 89 score
    // Student 3: 50 score
    // Student 4: 99 score
    // Student 5: 60 score
    // Student 6: 59 score

    // Expected output: return / Sysout Student[] (Student should have Candy attribute)
    private long id;
    private int score;
    private Candy2[] candies;

    public Student2(long id, int score) {
        this.id = id;
        this.score = score;
        this.candies = new Candy2[0];
    }

    public void receiveCandy(Candy2 candy) {
        // The student has to store the candies he receives.
        // new Array
        Candy2[] candies = new Candy2[this.candies.length + 1];
        // for loop to copy
        for (int i = 0; i < this.candies.length; i++) {
            candies[i] = this.candies[i];
        }
        // place candy at the tail
        candies[candies.length - 1] = candy;
        // replace the reference
        this.candies = candies;

    }

    public long getId() {
        return this.id;
    }


    public int getScore() {
        return this.score;
    }

    public Candy2[] getCandies() {
        return this.candies;
    }


    public String getCandiesInfo() {
        String info = "[";
        for (Candy2 candy: this.candies) {
            info += candy.getColor() + "," ;
        }
        return info.substring(0, info.length() - 1) + "]";
    }

    public int getCandiesReceived() {
        return this.candies.length;
    }

        
}
