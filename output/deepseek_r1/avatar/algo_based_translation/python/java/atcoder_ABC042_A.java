
import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputParts = scanner.nextLine().split(" ");
        int[] abc = new int[inputParts.length];
        
        for (int i = 0; i < inputParts.length; i++) {
            abc[i] = Integer.parseInt(inputParts[i]);
        }
        
        int fiveCount = 0;
        for (int num : abc) {
            if (num == 5) {
                fiveCount++;
            }
        }
        
        if (fiveCount == 2) {
            int total = 0;
            for (int num : abc) {
                total += num;
            }
            if (total == 17) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}

