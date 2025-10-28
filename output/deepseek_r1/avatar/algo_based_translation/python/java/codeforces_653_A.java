
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputParts = scanner.nextLine().split(" ");
        int[] numbers = new int[inputParts.length];
        for (int i = 0; i < inputParts.length; i++) {
            numbers[i] = Integer.parseInt(inputParts[i]);
        }
        Arrays.sort(numbers);
        for (int num : numbers) {
            if (Arrays.binarySearch(numbers, num + 1) >= 0 && Arrays.binarySearch(numbers, num + 2) >= 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}

