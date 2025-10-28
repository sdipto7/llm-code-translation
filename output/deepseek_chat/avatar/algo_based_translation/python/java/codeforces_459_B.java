
import java.util.*;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        int[] l1 = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            l1[i] = Integer.parseInt(inputArray[i]);
        }
        Arrays.sort(l1);
        int a = l1[l1.length - 1];
        int b = l1[0];
        if (a == b) {
            System.out.println((a - b) + " " + (n * (n - 1) / 2));
        } else {
            int ac = 0;
            int bc = 0;
            for (int num : l1) {
                if (num == a) ac++;
                if (num == b) bc++;
            }
            System.out.println((a - b) + " " + (ac * bc));
        }
    }
}

