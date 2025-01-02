import java.util.Arrays;

public class Teacher {
    private Candy2[] candies; // object reference
    private Student2[] students; // object reference

    public Teacher(Candy2[] candies, Student2[] students) {
        this.candies = candies;
        this.students = students;
    }

    public static boolean shouldDistribute(int score, char color) {
        return score >= 80 && color == 'R'
        || score >= 60 && score < 80 && color == 'B'
        || score < 60 && color == 'Y';
    }

    public void clearCandy(int pos) {
        this.candies[pos] = null;
    }
    
    // Teacher, Candy, Student2
    // Teacher only concerns candy distribution. He does not care how students receive them.
    public void distribute() {
        int pos = 0;
        while (true) {
            for (Student2 student: this.students) {
                if (shouldDistribute(student.getScore(), this.candies[pos].getColor())) {
                    student.receiveCandy(this.candies[pos]); // studen candy bag + 1
                    this.clearCandy(pos); // teacher's candy bag -1
                    if (++pos >= this.candies.length)
                    return;
                }
            }
    }
    }

    public static void main(String[] args) {
        // new Candy('R')
        // Teacher t1 = new Teacher();
        // t1.distribute()??
        Student2 s1 = new Student2(1L,67);
        Student2 s2 = new Student2(2L,89);
        Student2 s3 = new Student2(3L,50);
        Student2 s4 = new Student2(4L,99);
        Student2 s5 = new Student2(5L,60);
        Student2 s6 = new Student2(6L,59);
        Student2[] students = new Student2[] {s1, s2, s3, s4, s5, s6};

        Candy2 c1 = new Candy2('R');
        Candy2 c2 = new Candy2('B');
        Candy2 c3 = new Candy2('Y');
        Candy2 c4 = new Candy2('R');
        Candy2 c5 = new Candy2('R');
        Candy2 c6 = new Candy2('B');
        Candy2 c7 = new Candy2('R');
        Candy2 c8 = new Candy2('B');
        Candy2 c9 = new Candy2('Y');
        Candy2 c10 = new Candy2('Y');
        Candy2 c11 = new Candy2('R');
        Candy2 c12 = new Candy2('B');
        Candy2 c13 = new Candy2('B');
        Candy2 c14 = new Candy2('Y');
        Candy2 c15 = new Candy2('R');
        Candy2 c16 = new Candy2('R');
        Candy2 c17 = new Candy2('R');
        Candy2 c18 = new Candy2('B');
        Candy2 c19 = new Candy2('B');
        Candy2 c20 = new Candy2('Y');
        Candy2[] candies = new Candy2[] {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20};

        Teacher t1 = new Teacher(candies, students); //  Teacher t1 is holding the candies now and is going to distribute them to students. -> this
        t1.distribute();

        for (Student2 s : students) {
            System.out.println("Student " + s.getId() + "-" + s.getCandiesInfo());}

    }
}
