
import java.util.Scanner;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int c = 0;
        
        for (int i = 0; i < n; i++) {
            String[] inputValues = scanner.nextLine().split(" ");
            int sum = 0;
            
            for (String value : inputValues) {
                sum += Integer.parseInt(value);
            }
            
            if (sum > 1) {
                c++;
            }
        }
        
        System.out.println(c);
        scanner.close();
    }
}

