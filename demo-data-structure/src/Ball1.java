import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ball1 implements Comparable<Ball1> {
    private Color color;
    private int value;

    public Ball1(Color color, int value) {
        this.color = color;
        this.value = value;
    }

    public Color getColor() {
        return this.color;
    }

    public int getValue() {
        return this.value;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Ball1 ball) { // You provide the sorting criteria for Collections.sort() method
        // Compare two balls
        // this.ball (-1), ball (1)
        // order by color: RED, BLUE; YELLOW. For same color, descending order of value
        if (this.color == ball.getColor()) {
            if (this.value > ball.getValue())
                return -1;
            else   
                return 1;}
        if (this.color == Color.RED)
            return -1;
        if (ball.getColor() == Color.RED)
            return 1;
        if (this.color == Color.BLUE && ball.getColor() == Color.RED)
            return 1;
        if (this.color == Color.BLUE && ball.getColor() == Color.YELLOW)
            return -1;
        if (this.color == Color.YELLOW)
            return 1;
        if (ball.getColor() == Color.YELLOW)
            return -1;
            return -1; // else
    }

    public static enum Color { // for use in Ball Class only
        RED, YELLOW, BLUE,;
    }

    @Override
    public String toString() {
        return "Ball[color= " + this.color + ",value=" + this.value + "]";
    }

    public static void main(String[] args) {
        // Ball List
        // RED 1
        // YELLOW 9
        // BLUE 7
        // YELLOW 3
        // RED 8
        List<Ball1> balls = new ArrayList<>();
        balls.add(new Ball1(Color.RED, 1));
        balls.add(new Ball1(Color.YELLOW, 9));
        balls.add(new Ball1(Color.BLUE, 7));
        balls.add(new Ball1(Color.YELLOW, 3));
        balls.add(new Ball1(Color.RED, 8));

        System.out.println(balls);
         // [Ball[color= RED,value=1], Ball[color= YELLOW,value=9], Ball[color= BLUE,value=7], Ball[color= YELLOW,value=3], Ball[color= RED,value=8]]

        // Sort by values
        // Approach 1: Comparable<Ball> (Disadvantage: One Rule for sort)
        Collections.sort(balls); // Ball Class comply with the contract of Collections.sort()
        System.out.println(balls);
        // [Ball[color= RED,value=8], Ball[color= RED,value=1], Ball[color= BLUE,value=7], Ball[color= YELLOW,value=9], Ball[color= YELLOW,value=3]]
        
        // Approach 2: Comparator<Ball> (Better Design)
        Comparator<Ball1> sortFormula;
        int x = 1;
        if (x > 2) {
            sortFormula = new SortByColor();
        } else {
            sortFormula = new SortByValue();
        }
        Collections.sort(balls, sortFormula);
        System.out.println(balls);
        // [Ball[color= YELLOW,value=9], Ball[color= RED,value=8], Ball[color= BLUE,value=7], Ball[color= YELLOW,value=3], Ball[color= RED,value=1]]
    }

    // Collections.sort() concerns speed
    // User concerns how to sort
    // Interface (Comparable) controls the behavior (contract)
}
