public class Archer extends Hero {





    public static void main(String[] args) {
        Archer a1 = new Archer();
        a1.receivesMinorAttack();
        a1.receivesMajorAttack();
        a1.receivesMajorAttack();
        System.out.println(a1.isAlive()); // true
        System.out.println(a1.gethp()); // 30 
        a1.usesSpell();
        a1.usesSpell();
        a1.usesSpell(); // Insufficient MP. You cannot use spells at this moment.
        System.out.println(a1.getmp()); // 0
        a1.drinksHealingPotion();
        System.out.println(a1.gethp()); // 80
        a1.drinksHealingPotion();
        System.out.println(a1.gethp()); // 100
        a1.gainsMagicWand();
        a1.attendsAcademy();
        System.out.println(a1.getLevel()); // 2
        a1.gainsMagicWand();
        a1.gainsMagicWand();
        System.out.println(a1.getmp()); // 150
        a1.gainsMagicWand();
        System.out.println(a1.getmp()); // 150
        a1.usesSpell();
        a1.receivesMajorAttack();
        a1.receivesMinorAttack();
        a1.receivesMajorAttack();
        System.out.println(a1.isAlive()); // true
        System.out.println(a1.gethp()); // 30
        a1.attendsAcademy();
        System.out.println(a1.getLevel()); // 3
        a1.attendsAcademy(); // You have reached the maximum level.
        a1.receivesMajorAttack(); // GAME OVER

    }


}
