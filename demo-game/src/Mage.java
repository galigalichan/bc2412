public class Mage extends Hero {
    
    public int getMaxHp() {
        return Heros.getMaxHp(Role.MAGE, super.getLevel());
    }



    
}
