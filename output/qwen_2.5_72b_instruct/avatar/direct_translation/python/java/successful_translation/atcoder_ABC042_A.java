import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ABC = new int[3];
        for (int i = 0; i < 3; i++) {
            ABC[i] = scanner.nextInt();
        }
        int countOfFive = 0;
        int sum = 0;
        for (int num : ABC) {
            if (num == 5) {
                countOfFive++;
            }
            sum += num;
        }
        if (countOfFive == 2) {
            System.out.println(sum == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }
    }
}
