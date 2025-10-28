
import java.util.Scanner;

public class s607161467 {

    public static String determineContestCategory(int R) {
        if (R < 1200) {
            return "ABC";
        } else if (R < 2800) {
            return "ARC";
        } else {
            return "AGC";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        String result = determineContestCategory(R);
        System.out.println(result);
        scanner.close();
    }
}

