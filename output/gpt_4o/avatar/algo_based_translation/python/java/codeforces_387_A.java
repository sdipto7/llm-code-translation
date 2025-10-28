
import java.util.Scanner;

public class codeforces_387_A {

    public static void main(String[] args) {
        calculateTimeDifference();
    }

    public static void calculateTimeDifference() {
        Scanner scanner = new Scanner(System.in);
        
        String[] firstTime = scanner.nextLine().split(":");
        int h1 = Integer.parseInt(firstTime[0]);
        int m1 = Integer.parseInt(firstTime[1]);
        m1 += h1 * 60;

        String[] secondTime = scanner.nextLine().split(":");
        int h2 = Integer.parseInt(secondTime[0]);
        int m2 = Integer.parseInt(secondTime[1]);
        m2 += h2 * 60;

        m2 = m1 - m2;
        m2 %= 1440;

        int hours = m2 / 60;
        int minutes = m2 % 60;

        System.out.printf("%02d:%02d%n", hours, minutes);
        
        scanner.close();
    }
}

