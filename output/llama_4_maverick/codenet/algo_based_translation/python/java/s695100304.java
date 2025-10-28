
import java.util.Scanner;
import java.util.Arrays;

public class s695100304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        scanner.close();
        reverse(x);
        printArray(x);
    }

    public static void reverse(int[] x) {
        int left = 0;
        int right = x.length - 1;
        while (left < right) {
            int temp = x[left];
            x[left] = x[right];
            x[right] = temp;
            left++;
            right--;
        }
    }

    public static void printArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
            if (i < x.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

