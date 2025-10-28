
import java.util.Scanner;

public class codeforces_673_A {

    public static void processNumbers() {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        String[] inputNumbers = scanner.nextLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputNumbers[i]);
        }

        if (arr[0] > 15) {
            System.out.println(15);
        } else {
            boolean printed = false;
            for (int i = 1; i < n; i++) {
                if (arr[i] - arr[i - 1] > 15) {
                    System.out.println(arr[i - 1] + 15);
                    printed = true;
                    break;
                }
            }
            if (!printed) {
                if (arr[n - 1] == 90 || arr[n - 1] + 15 >= 90) {
                    System.out.println(90);
                } else {
                    System.out.println(arr[n - 1] + 15);
                }
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        processNumbers();
    }
}

