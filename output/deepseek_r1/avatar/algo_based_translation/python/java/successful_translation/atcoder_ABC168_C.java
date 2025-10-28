
import java.util.Scanner;
import java.lang.Math;

public class atcoder_ABC168_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int h = Integer.parseInt(inputs[2]);
        int m = Integer.parseInt(inputs[3]);

        double minuteAngle = 360.0 / 60.0 * m;
        double hourAngle = (360.0 / 12.0 * h) + (360.0 / 12.0 / 60.0 * m);
        double angle = Math.abs(minuteAngle - hourAngle);
        
        if (angle > 180.0) {
            angle = 360.0 - angle;
        }
        
        double cosAngle = Math.cos(Math.toRadians(angle));
        double result = Math.sqrt(a * a + b * b - 2 * a * b * cosAngle);
        System.out.printf("%.9f%n", result);
    }
}

