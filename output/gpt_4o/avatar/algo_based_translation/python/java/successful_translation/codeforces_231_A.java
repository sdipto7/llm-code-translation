
import java.util.Scanner;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int c = 0;
        
        scanner.nextLine(); // Consume the remaining newline
        
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            int[] l1 = new int[input.length];
            
            for (int j = 0; j < input.length; j++) {
                l1[j] = Integer.parseInt(input[j]);
            }
            
            int sum = 0;
            for (int num : l1) {
                sum += num;
            }
            
            if (sum > 1) {
                c++;
            }
        }
        
        System.out.println(c);
        
        scanner.close();
    }
}

