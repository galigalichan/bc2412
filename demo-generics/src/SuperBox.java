public class SuperBox<T extends Animal1, U extends Hero1, V extends Weapon> {
    // Without generics:
    // private Animal animal;
    // private Hero hero;
    // private Weapon weapon;
    private T animal;
    private U hero;
    private V weapon;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void setHero(U hero) {
        this.hero = hero;
    }

    public void setWeapon(V weapon) {
        this.weapon = weapon;
    }

    public double totalAttack() {
        return this.animal.run() + this.hero.attack() + this.weapon.onTopAttack() * 1.5; // Polyporphism: will only know what the methods actually are during runtime. Tiger, mage and bow can override.

    }

    public static void main(String[] args) {
        SuperBox<Animal1, Hero1, Weapon> s1 = new SuperBox<>();
        s1.setAnimal(new Tiger());
        s1.setHero(new Mage());
        s1.setWeapon(new Bow());
        System.out.println(s1.totalAttack()); // 7.5
        s1.setAnimal(new Panda());
        System.out.println(s1.totalAttack()); // 106.5
        s1.setWeapon(new Sword());
        System.out.println(s1.totalAttack()); // 1602.0
    }
}
