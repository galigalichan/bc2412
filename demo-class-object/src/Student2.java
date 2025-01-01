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

    private int score;
    private int redCandiesReceived;
    private int blueCandiesReceived;
    private int yellowCandiesReceived;
    private Candy candy;

    public Student2(int score) {
        this.score = score;
        this.redCandiesReceived = 0;
        this.blueCandiesReceived = 0;
        this.yellowCandiesReceived = 0;
    }


    public int getScore() {
        return this.score;
    }

    public int getRedCandiesReceived() {
        return this.redCandiesReceived;
    }

    public int getBlueCandiesReceived() {
        return this.blueCandiesReceived;
    }

    public int getYellowCandiesReceived() {
        return this.yellowCandiesReceived;
    }


    public static void main(String[] args) {
        Student2 s1 = new Student2(67);
        Student2 s2 = new Student2(89);
        Student2 s3 = new Student2(50);
        Student2 s4 = new Student2(99);
        Student2 s5 = new Student2(60);
        Student2 s6 = new Student2(59);
        Student2[] students2 = new Student2[] {s1, s2, s3, s4, s5, s6};

        Candy c1 = new Candy('R');
        Candy c2 = new Candy('B');
        Candy c3 = new Candy('Y');
        Candy c4 = new Candy('R');
        Candy c5 = new Candy('R');
        Candy c6 = new Candy('B');
        Candy c7 = new Candy('R');
        Candy c8 = new Candy('B');
        Candy c9 = new Candy('Y');
        Candy c10 = new Candy('Y');
        Candy c11 = new Candy('R');
        Candy c12 = new Candy('B');
        Candy c13 = new Candy('B');
        Candy c14 = new Candy('Y');
        Candy c15 = new Candy('R');
        Candy c16 = new Candy('R');
        Candy c17 = new Candy('R');
        Candy c18 = new Candy('B');
        Candy c19 = new Candy('B');
        Candy c20 = new Candy('Y');

        Candy[] candies = new Candy[] {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20};

        System.out.println(Candy.getRedCandiesCount());
        System.out.println(Candy.getBlueCandiesCount());
        System.out.println(Candy.getYellowCandiesCount());

        while ((Candy.getRedCandiesCount() + Candy.getBlueCandiesCount() + Candy.getYellowCandiesCount()) > 0) {
            for (int i = 0; i < students2.length; i++) {
                if (Candy.getRedCandiesCount() - 1 >= 0 && students2[i].getScore() >= 80) {
                    students2[i].redCandiesReceived++;
                    Candy.redCandiesCount--; 
                }   else if (Candy.getBlueCandiesCount() - 1 >= 0 && students2[i].getScore() >= 60 && students2[i].getScore() < 80) {
                    students2[i].blueCandiesReceived++;
                    Candy.blueCandiesCount--; 
                }   else if (Candy.getYellowCandiesCount() - 1 >= 0 && students2[i].getScore() < 60) {
                    students2[i].yellowCandiesReceived++;
                    Candy.yellowCandiesCount--;                     
                }
            }  
        }

        for (Student2 s : students2) {
            System.out.println(s.getRedCandiesReceived() + ", " + s.getBlueCandiesReceived() + ", " + s.getYellowCandiesReceived());}
        
        System.out.println(Arrays.deepToString(students2));

        }
        
}
