public class Hero {
    // HP - Health Point
    // MP - Magic Point
    // Level -> Increase Max HP, Max MP

    // Method:
    // Presentation: isAlive
    // Action: Level Up

    private int HP;
    private int MP;
    private int MaxHP1 = 100;
    private int MaxHP2 = 200;
    private int MaxHP3 = 300;
    private int MaxMP1 = 100;
    private int MaxMP2 = 150;
    private int MaxMP3 = 200;
    private int level;
    
    public Hero() {
        this.HP = 100;
        this.MP = 100;
        this.level = 1;
    }

    public int getHP() {
        return this.HP;
    }

    public int getMP() {
        return this.MP;
    }

    public int getLevel() {
        return this.level;
    }

    public boolean isAlive() {
        return this.HP > 0;
    }

    public void receivesMinorAttack() {
        if (this.HP - 10 > 0) {
        this.HP -= 10;
        } else {
        this.HP = 0;
        System.out.println("GAME OVER");
        }
    }

    public void receivesMajorAttack() {
        if (this.HP - 30 > 0) {
        this.HP -= 30;
        } else {
        this.HP = 0;
        System.out.println("GAME OVER");
        }
    }

    public void drinksHealingPotion() {
        if (this.level == 1 && this.HP <= 50) {
            this.HP += 50;
        } else if (this.level == 1 && this.HP > 50) {
            this.HP = MaxHP1;
        } else if (this.level == 2 && this.HP <= 150) {
            this.HP += 50;   
        } else if (this.level == 2 && this.HP > 150) {
            this.HP = MaxHP2;
        } else if (this.level == 3 && this.HP <= 250) {  
            this.HP += 50;
        } else {
            this.HP = MaxHP3;
        }
    }

    public void usesSpell() {
        if (this.MP - 50 >= 0) {
            this.MP -= 50;
        } else {
            System.out.println("Insufficient MP. You cannot use spells at this moment.");
        }
    }

    public void gainsMagicWand() {
        if (this.level == 1 && this.MP <= 50) {
            this.MP += 50;
        } else if (this.level == 1 && this.MP > 50) {
            this.MP = MaxMP1;
        } else if (this.level == 2 && this.MP <= 100) {
            this.MP += 50;   
        } else if (this.level == 2 && this.MP > 100) {
            this.MP = MaxMP2;
        } else if (this.level == 3 && this.MP <= 150) {  
            this.MP += 50;
        } else {
            this.MP = MaxMP3;
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
        Hero h1 = new Hero();
        h1.receivesMinorAttack();
        h1.receivesMajorAttack();
        h1.receivesMajorAttack();
        System.out.println(h1.isAlive()); // true
        System.out.println(h1.getHP()); // 30 
        h1.usesSpell();
        h1.usesSpell();
        h1.usesSpell(); // Insufficient MP. You cannot use spells at this moment.
        System.out.println(h1.getMP()); // 0
        h1.drinksHealingPotion();
        System.out.println(h1.getHP()); // 80
        h1.drinksHealingPotion();
        System.out.println(h1.getHP()); // 100
        h1.gainsMagicWand();
        h1.attendsAcademy();
        System.out.println(h1.getLevel()); // 2
        h1.gainsMagicWand();
        h1.gainsMagicWand();
        System.out.println(h1.getMP()); // 150
        h1.gainsMagicWand();
        System.out.println(h1.getMP()); // 150
        h1.usesSpell();
        h1.receivesMajorAttack();
        h1.receivesMinorAttack();
        h1.receivesMajorAttack();
        System.out.println(h1.isAlive()); // true
        System.out.println(h1.getHP()); // 30
        h1.attendsAcademy();
        System.out.println(h1.getLevel()); // 3
        h1.attendsAcademy(); // You have reached the maximum level.
        h1.receivesMajorAttack(); // GAME OVER

    }

}
