public abstract class Account {
    private Currency currency;
    private double balance; // 1000 -> 1,000
    // private AccountType type;

    public Account(Currency currency, double balance) {
        this.currency = currency;
        this.balance = balance;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    // 1000 -> 1,000 (substring)
    public String getBalanceDesc() {
        return this.currency.name() + this.balance; // HKD1.000
    }

    public static void main(String[] args) {
        Ball b1 = new Ball(Color.BLUE);
        b1.number = 3;
        System.out.println(b1.number); // 3
    }

}
