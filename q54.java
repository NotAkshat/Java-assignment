class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class TemperatureCheck {
    public static void main(String[] args) {
        double temperature = Double.parseDouble(args[0]);
        try {
            if (temperature > 35) throw new TooHot("Too hot");
            if (temperature < 5) throw new TooCold("Too cold");
            System.out.println("Normal Temperature: " + (temperature * 9 / 5 + 32) + "°F");
        } catch (TooHot | TooCold e) {
            System.out.println(e.getMessage());
        }
    }
}
