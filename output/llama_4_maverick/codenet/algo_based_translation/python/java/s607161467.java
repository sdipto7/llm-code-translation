
import java.util.Scanner;

public class s607161467 {
    public static void main(String[] args) {
        determineContestCode();
    }

    public static void determineContestCode() {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        scanner.close();

        if (R < 1200) {
            System.out.println("ABC");
        } else if (R < 2800) {
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}

