import java.math.BigDecimal;

public class LoanCalculator {
    private double principle;
    private double annualInterstRate;
    private int numOfYears;

    //constructor
    public LoanCalculator(double principle, double annualInterstRate, int numOfYears) {
        this.principle = principle;
        this.annualInterstRate = annualInterstRate;
        this.numOfYears = numOfYears;
    }

    // totalInterestAfterYears()
    public double totalInterestAfterYears() {
        return BigDecimal.valueOf(this.principle)
        .multiply(BigDecimal.valueOf(Math.pow(1 + this.annualInterstRate / 100.0, this.numOfYears)))
        .subtract(BigDecimal.valueOf(this.principle))
        .doubleValue();
    }

    // static method 
    public static double totalInterstAfterYears(double principle, double annualInterstRate, int numOfYears) {
        return BigDecimal.valueOf(principle)
        .multiply(BigDecimal.valueOf(Math.pow(1 + annualInterstRate / 100.0, numOfYears)))
        .subtract(BigDecimal.valueOf(principle))
        .doubleValue();

    }


    public double getPrinciple() {
        return this.principle;
    }

    public double getAnnualInterestRate() {
        return this.annualInterstRate;
    }

    public int getNumOfYears() {
        return this.numOfYears;
    }



    public static void main(String[] args) {
        LoanCalculator lc = new LoanCalculator(10_000, 2.0, 2);
        System.out.println(lc.totalInterestAfterYears()); // 404.0 // Instance Method
        System.out.println(totalInterstAfterYears(10_000, 2.0, 2)); // 404.0 // Static Method
    }

}

