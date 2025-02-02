public enum Direction {
    EAST(90, 1), NORTH(360, 2), WEST(270, -1), SOUTH(180, -2),;

    private final int angle;
    private final int value;

    private Direction(int angle, int value) {
        this.angle = angle;
        this.value = value;
    }

    public int getAngle() {
        return this.angle;
    }

    // public int getValue() {
    //     return this.value;
    // }
    
    // Direction.NORTH.opposite() -> Direction.SOUTH
    public Direction opposite() {
        for (Direction d : values()) {
            if (d.value == this.value * -1)
            return d;
        }
        return null; // throw exception
    }

    public static void main(String[] args) {
        System.out.println(Direction.EAST.getAngle()); // 90
        System.out.println(Direction.NORTH.opposite()); // SOUTH
    }
}
