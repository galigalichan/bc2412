public abstract class Hero implements Comparable<Hero> {
    // HP - Health Point
    // MP - Magic Point
    // Level -> Increase Max HP, Max MP
    // attackPower

    // Method:
    // Presentation: isAlive
    // Action: Level Up: +MaxHP, +MaxMP

    // Hero is a Parent Class
    // Child Class: Archer, Mage, Warrior

    // attackPower
    private Role role;
    private int level;
    private int hp;
    private int mp;
    
    public Hero() {
        this.level = 1;
    }

    public Hero(Role role) {
        switch (role) {
            case ARCHER:
            this.level = 1;
            this.hp = Heros.ARC_TAB[0][0];
            this.mp = Heros.ARC_TAB[1][0];
            case WARRIOR:
            this.level = 1;
            this.hp = Heros.WAR_TAB[0][0];
            this.mp = Heros.WAR_TAB[1][0];
            case MAGE:
            this.level = 1;
            this.hp = Heros.MAG_TAB[0][0];
            this.mp = Heros.MAG_TAB[1][0];
        } 
    }

    public int getLevel() {
        return this.level;
    }

    public int getHp() {
        return this.hp;
    }

    public int getMp() {
        return this.mp;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    //public static Archer createArcher() {
    //     return new Archer();
    // }

    public void receivesMinorAttack() {
        if (this.hp - 10 > 0) {
        this.hp -= 10;
        } else {
        this.hp = 0;
        System.out.println("GAME OVER");
        }
    }

    public void receivesMajorAttack() {
        if (this.hp - 30 > 0) {
        this.hp -= 30;
        } else {
        this.hp = 0;
        System.out.println("GAME OVER");
        }
    }

    public void drinksHealingPotion() {
        switch (role) {
            case ARCHER:
            this.hp = Heros.ARC_TAB[0][getLevel()];
            case WARRIOR:
            this.hp = Heros.WAR_TAB[0][getLevel()];
            case MAGE:
            this.hp = Heros.MAG_TAB[0][getLevel()];
        } 
    }

    public void usesSpell() {
        if (this.mp - 50 >= 0) {
            this.mp -= 50;
        } else {
            System.out.println("Insufficient MP. You cannot use spells at this moment.");
        }
    }

    public void gainsMagicWand() {
        switch (role) {
            case ARCHER:
            this.mp = Heros.ARC_TAB[1][getLevel()];
            case WARRIOR:
            this.mp = Heros.WAR_TAB[1][getLevel()];
            case MAGE:
            this.mp = Heros.MAG_TAB[1][getLevel()];
        } 
    }

    public void attendsAcademy() {
        if (this.level <= 2) {
        this.level += 1;
        } else {
        this.level = 3;
        System.out.println("You have reached the maximum level.");
        }
    }

    public static void main(String[] args) {
        Archer a1 = new Archer(Role.ARCHER);
        a1.receivesMinorAttack();
        a1.receivesMajorAttack();
        a1.receivesMajorAttack();
        System.out.println(a1.isAlive()); // true
        System.out.println(a1.getHp()); // 30 
        a1.usesSpell();
        a1.usesSpell();
        a1.usesSpell(); // Insufficient MP. You cannot use spells at this moment.
        System.out.println(a1.getMp()); // 0
        a1.drinksHealingPotion();
        System.out.println(a1.getHp()); // 80
        a1.drinksHealingPotion();
        System.out.println(a1.getHp()); // 100
        a1.gainsMagicWand();
        a1.attendsAcademy();
        System.out.println(a1.getLevel()); // 2
        a1.gainsMagicWand();
        a1.gainsMagicWand();
        System.out.println(a1.getMp()); // 150
        a1.gainsMagicWand();
        System.out.println(a1.getMp()); // 150
        a1.usesSpell();
        a1.receivesMajorAttack();
        a1.receivesMinorAttack();
        a1.receivesMajorAttack();
        System.out.println(a1.isAlive()); // true
        System.out.println(a1.getHp()); // 30
        a1.attendsAcademy();
        System.out.println(a1.getLevel()); // 3
        a1.attendsAcademy(); // You have reached the maximum level.
        a1.receivesMajorAttack(); // GAME OVER
    }

}
