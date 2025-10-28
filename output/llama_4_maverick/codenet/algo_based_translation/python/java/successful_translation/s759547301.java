
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class s759547301 {
    private static Map<String, String> weatherCycle = new HashMap<>();

    static {
        weatherCycle.put("Sunny", "Cloudy");
        weatherCycle.put("Cloudy", "Rainy");
        weatherCycle.put("Rainy", "Sunny");
    }

    public static String getNextWeather(String weather) {
        if (weather.equals("Sunny")) {
            return "Cloudy";
        } else if (weather.equals("Cloudy")) {
            return "Rainy";
        } else if (weather.equals("Rainy")) {
            return "Sunny";
        }
        return null;
    }

    public static String getNextWeatherOptimized(String weather) {
        return weatherCycle.get(weather);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(getNextWeather(S));
        // System.out.println(getNextWeatherOptimized(S));
    }
}

