import java.util.Scanner;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            String[] inputLine = scanner.nextLine().trim().split(" ");
            int[] l1 = new int[inputLine.length];
            for (int j = 0; j < inputLine.length; j++) {
                l1[j] = Integer.parseInt(inputLine[j]);
            }
            if (sum(l1) > 1) {
                c++;
            }
        }
        System.out.println(c);
        scanner.close();
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }
}
