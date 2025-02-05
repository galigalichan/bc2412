public class Ball2 {
    private int value;

    public Ball2 addValue(int value){
        this.value += value;
        return this;
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Ball2 ball = new Ball2();
        ball = ball.addValue(3);
        ball = ball.addValue(4);

        System.out.println(ball.getValue());
    }
}
