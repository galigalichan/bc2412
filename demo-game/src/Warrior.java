public class Warrior extends Hero {
    
    public int getMaxHp() {
        return Heros.getMaxHp(Role.WARRIOR, super.getLevel());
    }
}
