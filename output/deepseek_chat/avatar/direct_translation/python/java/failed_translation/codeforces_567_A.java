
import java.util.Scanner;

public class codeforces_567_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.println((arr[i + 1] - arr[i]) + " " + (arr[arr.length - 1] - arr[i]));
                continue;
            } else if (i == arr.length - 1) {
                System.out.println((arr[arr.length - 1] - arr[arr.length - 2]) + " " + (arr[arr.length - 1] - arr[0]));
                continue;
            } else if (arr[i] - arr[i - 1] > arr[i + 1] - arr[i]) {
                System.out.print((arr[i + 1] - arr[i]) + " ");
            } else {
                System.out.print((arr[i] - arr[i - 1]) + " ");
            }
            if (arr[arr.length - 1] - arr[i] > arr[i] - arr[0]) {
                System.out.println(arr[arr.length
