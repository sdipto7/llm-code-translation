
import java.util.Scanner;

public class s040517919 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(determineWinner(A, B));
        scanner.close();
    }

    public static String determineWinner(int A, int B) {
        if (A == B) {
            return "Draw";
        } else if (A == 1) {
            return "Alice";
        } else if (B == 1) {
            return "Bob";
        } else if (A > B) {
            return "Alice";
        } else {
            return "Bob";
        }
    }
}

