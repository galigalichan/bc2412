public abstract class Hero {
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
    private int level;
    private int hp;
    private int mp;
    
    public Hero() {
        this.level = 1;
    }

    public int gethp() {
        return this.hp;
    }

    public int getmp() {
        return this.mp;
    }

    public int getLevel() {
        return this.level;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public static Archer createArcher() {
        return new Archer();
    }

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
        if (this.level == 1 && this.hp <= 50) {
            this.hp += 50;
        } else if (this.level == 1 && this.hp > 50) {
            this.hp = maxHp1;
        } else if (this.level == 2 && this.hp <= 150) {
            this.hp += 50;   
        } else if (this.level == 2 && this.hp > 150) {
            this.hp = maxHp2;
        } else if (this.level == 3 && this.hp <= 250) {  
            this.hp += 50;
        } else {
            this.hp = maxHp3;
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
        if (this.level == 1 && this.mp <= 50) {
            this.mp += 50;
        } else if (this.level == 1 && this.mp > 50) {
            this.mp = maxMp1;
        } else if (this.level == 2 && this.mp <= 100) {
            this.mp += 50;   
        } else if (this.level == 2 && this.mp > 100) {
            this.mp = maxMp2;
        } else if (this.level == 3 && this.mp <= 150) {  
            this.mp += 50;
        } else {
            this.mp = maxMp3;
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
        Archer a1 = Hero1.createArcher();
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
