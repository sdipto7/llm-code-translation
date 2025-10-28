import java.util.Scanner;

public class codeforces_567_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[n];
        String[] inputs = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println((arr[1] - arr[0]) + " " + (arr[n-1] - arr[0]));
            } else if (i == n-1) {
                System.out.println((arr[n-1] - arr[n-2]) + " " + (arr[n-1] - arr[0]));
            } else {
                int min = Math.min(arr[i] - arr[i-1], arr[i+1] - arr[i]);
                int max = Math.max(arr[i] - arr[0], arr[n-1] - arr[i]);
                System.out.println(min + " " + max);
            }
        }
    }
}
