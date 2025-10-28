import java.util.Scanner;

public class s704354119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        int max = (int) -1e9;
        int min = (int) 1e9;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
            sum += l[i];
            if (max < l[i]) {
                max = l[i];
            }
            if (min > l[i]) {
                min = l[i];
            }
        }
        System.out.println(min + " " + max + " " + sum);
    }
}
