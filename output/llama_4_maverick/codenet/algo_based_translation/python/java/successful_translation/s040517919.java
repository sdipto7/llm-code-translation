
import java.util.Scanner;

public class s040517919 {
    public static void determineWinner() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        if (A == B) {
            System.out.println("Draw");
            return;
        }
        if (A == 1) {
            System.out.println("Alice");
            return;
        }
        if (B == 1) {
            System.out.println("Bob");
            return;
        }
        if (A > B) {
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
    }

    public static void main(String[] args) {
        determineWinner();
    }
}

