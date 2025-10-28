
import java.util.Scanner;

public class s759547301 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from standard input
        String S = scanner.nextLine();
        
        // Call determine_weather_transition and print the result
        System.out.println(determineWeatherTransition(S));
        
        scanner.close();
    }

    public static String determineWeatherTransition(String S) {
        String output = "";

        // Check the conditions and set output
        if (S.equals("Sunny")) {
            output = "Cloudy";
        } else if (S.equals("Cloudy")) {
            output = "Rainy";
        } else if (S.equals("Rainy")) {
            output = "Sunny";
        }

        return output;
    }
}

