import java.math.BigDecimal;
import java.math.RoundingMode;

public class Human {
    // attribute
    private String name;
    private char gender;
    private double height; // instance variable
    private double weight; // instance variable

    public Human(String name, char gender, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public char getGender() {
        return this.gender;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public double bmi() {
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
        public static double bmi2(double height, double weight) {
            return BigDecimal.valueOf(weight)
            .divide(BigDecimal.valueOf(Math.pow(height, 2.0)), 2,RoundingMode.HALF_UP)
            .doubleValue();
        }

    public static void main(String[] args) {
    Human h1 = new Human("Jimmy",'M', 1.74, 68.0);
    System.out.println(h1.bmiIndex()); // Normal
    System.out.println(h1.bmi()); // 22.46
    System.out.println(Human.bmi2(1.74, 68));

    }


    
}
