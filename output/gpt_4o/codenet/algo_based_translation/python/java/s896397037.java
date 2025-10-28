
import java.util.Scanner;
import java.util.Arrays;

public class s896397037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input operation
        String input = scanner.nextLine();
        char[] s = input.toCharArray();
        
        // Data processing
        Arrays.sort(s);
        
        // Conditional logic
        if (s[0] == s[1] && s[0] != s[2] && s[2] == s[3]) {
            // Output operation
            System.out.println("Yes");
        } else {
            // Output operation
            System.out.println("No");
        }
        
        scanner.close();
    }
}

