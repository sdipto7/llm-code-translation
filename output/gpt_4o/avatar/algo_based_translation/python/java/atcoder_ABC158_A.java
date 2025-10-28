
import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Read a string from standard input
        String stdin = scanner.nextLine();
        
        // Variable Declaration
        String s = stdin;
        String result;
        
        // Logic and Control Flow
        if (s.contains("A") && s.contains("B")) {
            result = "Yes";
        } else {
            result = "No";
        }
        
        // Output
        System.out.println(result);
        
        scanner.close();
    }
}

