
import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        processInput();
    }

    public static void processInput() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        scanner.close();

        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int countOfFives = 0;
        int sum = 0;
        for (int number : numbers) {
            if (number == 5) {
                countOfFives++;
            }
            sum += number;
        }

        if (countOfFives == 2) {
            if (sum == 17) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}

