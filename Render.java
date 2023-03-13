public class Render {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    private String scale;
    private String color;

    public void render(Object object) {
        if (object instanceof HasHealthPoint hasHealthPoint) {
            scale = scale(hasHealthPoint.getMaxHealthPoint(), hasHealthPoint.getCurrentHealthPoint());
            color = color(hasHealthPoint.getMaxHealthPoint(), hasHealthPoint.getCurrentHealthPoint());
            System.out.println("HP=" + toString(scale, color));
        }

        if (object instanceof Tiredness tiredness) {
            scale = scale(tiredness.getMaxHealthPoint(), tiredness.getCurrentHealthPoint());
            color = color(tiredness.getMaxHealthPoint(), tiredness.getCurrentHealthPoint());
            System.out.println("HP=" + toString(scale, color));

            scale = scale(tiredness.getMaxEnergy(), tiredness.getCurrentEnergy());
            System.out.println("Energy=" + toString(scale, ANSI_BLUE));
        } 
    }

    public String scale(int maxSize, int currentSize) {
        String scale = "";
        for (int i = 0; i < currentSize; i++) {
            scale += "-";
        }

        while (currentSize < maxSize) {
            scale += " ";
            currentSize++;
        }
        return scale;
    }

    public String color(int maxSize, int currentSize) {
        String color;
        if (currentSize <= maxSize/3) {
            color = ANSI_RED;
        } else if (currentSize > maxSize/3 && currentSize <= (maxSize/3)*2) {
            color = ANSI_YELLOW;
        } else {
            color = ANSI_GREEN;
        }
        return color;
    }

    public String toString(String line, String color) {
        return "["+ color + line + ANSI_RESET + "]";
    }
}