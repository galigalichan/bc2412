import java.math.BigDecimal;
import java.math.RoundingMode;

public class Human {
    // attribute
    private String name;
    private char gender;
    private double height; // instance variable
    private double weight; // instance variable

    // Can be more than one constructor
    public Human(String name, char gender, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    // empty constructor
    public Human() {

    }

    // Constructor is same as method. Not allow same constructor signature
    public Human(double height) {
        this.height = height;
    }

    // public Human(double weight) {
    //     this.weight = weight;
    // }



    // no getter (info not accessible by getter)

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public char getGender() {
        return this.gender;
    }

    public static char getGender(Human human) { // rubbish coding
        return human.getGender();
    }

    // instance method
    public double bmi() { // Human h1 = new Human(1.74, 64) -> h1.bmi()
            return BigDecimal.valueOf(this.weight)
            .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2,RoundingMode.HALF_UP)
            // .setScale(2, RoundingMode.HALF_DOWN) // for other operations: +, -, *
            .doubleValue();
        }

        // instance method
        // Able to call object attribute & instance method
        public String bmiIndex() {
            double bmiValue = this.bmi();
            if (bmiValue >= 35.0) {
                return "Extremely obese";
            } else if (bmiValue >= 30.0 && bmiValue < 35.0) {
                return "Obese";
            } else if (bmiValue >= 25.0 && bmiValue < 30.0) {
                return "Overweight";
            } else if (bmiValue >= 18.5 && bmiValue < 25) {
                return "Normal";
            } else {
                return "Underweight";
            }
        }
    
        // static method
        // Wrong Design for Object
        public static double bmi(double height, double weight) {
            return BigDecimal.valueOf(weight)
            .divide(BigDecimal.valueOf(Math.pow(height, 2.0)), 2,RoundingMode.HALF_UP)
            .doubleValue();
        }

    public static void main(String[] args) {
    Human h1 = new Human("Jimmy",'M', 1.74, 68.0);
    System.out.println(h1.bmiIndex()); // Normal
    System.out.println(h1.bmi()); // 22.46
    System.out.println(Human.bmi(1.74, 68));

    // Construct object by empty constructor
    Human h2 = new Human();
    System.out.println(h2.getHeight()); // 0.0
    System.out.println(h2.getWeight()); // 0.0
    System.out.println(h2.getGender()); // ' '

    if (h2.getGender() == '\u0000') { // different from ' '
        System.out.println("char's default value.");
    }

    double x;
    // for local variable, you cannot get the value before initialization
    // System.out.println(x);
    }

    
}
