public class DemoSwitchExpression {
    public static void main(String[] args) {
        // Swtich + Lambda
        System.out.println(getColorValue(Color.RED)); // R
    }

    public static String getColorValue(Color color) {
        return switch (color) { // a Swtich expression should cover all possible values -> if any missing, compile error
            case RED -> {
                yield "Red."; // return within return -> yield
            }
            case YELLOW -> {
                yield "Yellow.";
            }
            case BLUE -> {
                yield "Blue.";
            }
            // case BLUE -> 'Y'; // duplicate case -> complile error
        };
    }

    public static char getColorValue2(Color color) {
        return switch (color) { // a Swtich expression should cover all possiblr values -> if missing, compile error
            case RED -> 'R';
            case YELLOW -> 'Y';
            case BLUE -> 'B';
            // case BLUE -> 'Y'; // duplicate case -> complile error
        };
    }


    public static enum Color {
        RED, YELLOW, BLUE,;
    }
}
