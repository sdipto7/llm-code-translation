
import java.util.Scanner;
import java.lang.Math;

public class atcoder_ABC168_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Parse input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        
        // Calculate the angle `C` in degrees between the hour and minute hand
        double angle_minute_hand = 360.0 / 60 * m;
        double angle_hour_hand = 360.0 / 12 * h + 360.0 / 12 / 60 * m;
        double C = Math.abs(angle_minute_hand - angle_hour_hand);
        
        // Normalize the angle `C` to be the smaller angle between the two hands
        if (C > 180) {
            C = 360 - C;
        }
        
        // Convert angle `C` to radians
        double angle_C_radians = Math.toRadians(C);
        
        // Calculate the cosine of angle `C`
        double cosC = Math.cos(angle_C_radians);
        
        // Apply the law of cosines to find the distance between the two ends of the clock hands
        double distance = Math.sqrt(a * a + b * b - 2 * a * b * cosC);
        
        // Output the calculated distance
        System.out.println(distance);
        
        scanner.close();
    }
}

