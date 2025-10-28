
import java.util.Scanner;

public class s607161467 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        scanner.close();
        System.out.println(determine_contest(R));
    }

    public static String determine_contest(int R) {
        if (R < 1200) {
            return "ABC";
        } else if (R < 2800) {
            return "ARC";
        } else {
            return "AGC";
        }
    }
}

