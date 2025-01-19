import java.math.BigDecimal;

public class Square {
    private BigDecimal length;

    public BigDecimal area() {
        return this.length.multiply(this.length);
    }


    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public static void main(String[] args) {
        Square s = new Square();
        s.setLength(5.0);
    }
}
