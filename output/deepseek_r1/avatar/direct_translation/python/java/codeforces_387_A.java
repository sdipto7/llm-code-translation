
import java.util.Scanner;

public class codeforces_387_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] time1 = scanner.nextLine().split(":");
        int h1 = Integer.parseInt(time1[0]);
        int m1 = Integer.parseInt(time1[1]);
        int total1 = h1 * 60 + m1;
        
        String[] time2 = scanner.nextLine().split(":");
        int h2 = Integer.parseInt(time2[0]);
        int m2 = Integer.parseInt(time2[1]);
        int total2 = h2 * 60 + m2;
        
        int difference = total1 - total2;
        int result = Math.floorMod(difference, 1440);
        
        int hours = result / 60;
        int minutes = result % 60;
        
        System.out.printf("%02d:%02d%n", hours, minutes);
    }
}

