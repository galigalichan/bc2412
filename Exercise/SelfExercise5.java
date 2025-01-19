public class SelfExercise5 {
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Point))
            return false;
        Point point = (Point) obj;
        return this.x == point.x && this.y && point.y;

    }

    public boolean equals (Object obj) {
        if (this == obj)
        return true;
        if (!(obj instanceof Point))
            return false;
        Point point = (Point) obj;
        return this.x == point.x && this.x && point.y;
    }



}
