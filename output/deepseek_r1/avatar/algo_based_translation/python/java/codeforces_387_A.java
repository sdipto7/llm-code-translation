
import java.util.Scanner;

public class codeforces_387_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] time1Parts = scanner.nextLine().split(":");
        int h1 = Integer.parseInt(time1Parts[0]);
        int m1 = Integer.parseInt(time1Parts[1]);
        int total1 = h1 * 60 + m1;
        
        String[] time2Parts = scanner.nextLine().split(":");
        int h2 = Integer.parseInt(time2Parts[0]);
        int m2 = Integer.parseInt(time2Parts[1]);
        int total2 = h2 * 60 + m2;
        
        int diff = total1 - total2;
        diff %= 1440;
        if (diff < 0) {
            diff += 1440;
        }
        
        int hours = diff / 60;
        int minutes = diff % 60;
        
        System.out.printf("%02d:%02d%n", hours, minutes);
    }
}

