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

    private int hp;
    private int mp;
    private int level;
    
    // static final
    private int maxHp1 = 100;
    private int maxHp2 = 200;
    private int maxHp3 = 300;
    private int maxMp1 = 100;
    private int maxMp2 = 150;
    private int maxMp3 = 200;
    
    public Hero() {
        this.hp = 100;
        this.mp = 100;
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


}
