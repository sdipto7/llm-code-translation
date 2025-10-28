
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputValues = scanner.nextLine().split(" ");
        int[] l1 = new int[n];
        for (int i = 0; i < n; i++) {
            l1[i] = Integer.parseInt(inputValues[i]);
        }
        Arrays.sort(l1);
        int a = l1[n - 1];
        int b = l1[0];
        int maxDiff = a - b;
        int pairCount;
        
        if (a == b) {
            pairCount = n * (n - 1) / 2;
        } else {
            int bc = 0;
            while (bc < n && l1[bc] == b) {
                bc++;
            }
            int ac = 0;
            while (ac < n && l1[n - 1 - ac] == a) {
                ac++;
            }
            pairCount = ac * bc;
        }
        System.out.println(maxDiff + " " + pairCount);
    }
}

