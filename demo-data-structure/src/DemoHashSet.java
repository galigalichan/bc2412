import java.util.HashSet;

public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("ABC");
        strings.add("IJK");
        System.out.println(strings.size()); // 2

        // Difference between Hashset and ArrayList
        strings.add("ABC");
        System.out.println(strings.add("ABC")); // false, failed to add
        System.out.println(strings.size()); // 2, HashSet avoid duplicate item

        System.out.println(strings.add("XYZ")); // true
        System.out.println(strings.size()); // 3

        strings.remove(new String("XYZ")); // OR strings.remove("XYZ");
        System.out.println(strings.size()); // 2
        System.out.println(strings); // [ABC, IJK]


        // HashSet cannot be ordering naturally
        // because its underlying data structure is not an array.
        // so, hashSet did not provide remove by index method.


        // Hero
        HashSet<String> heros = new HashSet<>();
        heros.add("Archer");
        heros.add("Mage");
        System.out.println(heros.size()); // 2
        heros.add("Archer");
        System.out.println(heros.add("Archer")); // false
        System.out.println(heros.size()); // 2
        heros.add("Warrior");
        System.out.println(heros.size()); // 3
        System.out.println(heros); // [Warrior, Archer, Mage]
        heros.remove(new String("Archer"));
        System.out.println(heros.size()); // 2
        System.out.println(heros); // [Warrior, Mage]

    }
}
