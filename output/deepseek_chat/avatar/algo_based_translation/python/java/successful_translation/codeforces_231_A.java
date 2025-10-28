
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int c = 0;
        
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            int[] l1 = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();
            int sum = Arrays.stream(l1).sum();
            if (sum > 1) {
                c++;
            }
        }
        
        System.out.println(c);
    }
}

