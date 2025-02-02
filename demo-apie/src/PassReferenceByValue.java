public class PassReferenceByValue {
    public static void doSomething(String name) {
        name = "LAB";
        
    }

    public static void addLab(StringBuilder name1) {
        name1.append("LAB");
        
    }

    public void doSomething(AmountHolder a) {
        a = new AmountHolder(99);
        
    }

    public static void doOtherThing(AmountHolder a) {
        a.setAmount(100);
        
    }


    public static void main(String[] args) {
        String name = new String("Venturenix");
        doSomething(name);
        System.out.println(name); // Venturenix

        StringBuilder name1 = new StringBuilder("Venturenix");
        addLab(name1);
        System.out.println(name1); // VenturenixLAB

        AmountHolder holder = new AmountHolder(10);
        doSomething(holder);
        System.out.println("Amount is " + holder.getAmount());
        doOtherThing(holder);
        System.out.println("Amount is " + holder.getAmount());

    }

    public class AmountHolder {
        private int amount;


        public AmountHolder(int amount) {
            this.amount = amount;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }
    }
}
