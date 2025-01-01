public class Candy {
    private char color;
    static int redCandiesCount;
    static int blueCandiesCount;
    static int yellowCandiesCount;

public Candy(char color) {
    this.color = color;
    if (color == 'R') {
        Candy.redCandiesCount++;
    }
    if (color == 'B') {
        Candy.blueCandiesCount++;
    }
    if (color == 'Y') {
        Candy.yellowCandiesCount++;
    }
}

public char getColor() {
    return this.color;
}

public static int getRedCandiesCount() {
    return Candy.redCandiesCount;
}

public static int getBlueCandiesCount() {
    return Candy.blueCandiesCount;
}

public static int getYellowCandiesCount() {
    return Candy.yellowCandiesCount;
}

}
