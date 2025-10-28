
import java.util.Scanner;

public class codeforces_25_A {
    public static void main(String[] args) {
        determineIndex();
    }

    public static void determineIndex() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        String[] inputNumbers = scanner.nextLine().split(" ");

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(inputNumbers[i]);
            list[i] = number % 2;
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        if (sum == 1) {
            for (int i = 0; i < n; i++) {
                if (list[i] == 1) {
                    System.out.println(i + 1);
                    break;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (list[i] == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }

        scanner.close();
    }
}

