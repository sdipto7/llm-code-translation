
import java.util.Scanner;

public class codeforces_99_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        String l = scanner.nextLine();
        
        // Split the input string
        String[] parts = l.split("\\.");
        
        // Extract the parts before and after the dot
        char[] s = parts[0].toCharArray();
        char[] p = parts[1].toCharArray();
        
        // Convert the first character after the dot to an integer
        int i = Character.getNumericValue(p[0]);
        
        // Check conditions and print output
        if (s[s.length - 1] == '9') {
            System.out.println("GOTO Vasilisa.");
        } else if (s[s.length - 1] != '9' && i < 5) {
            System.out.println(new String(s));
        } else {
            int num = Integer.parseInt(new String(s)) + 1;
            System.out.println(num);
        }
        
        scanner.close();
    }
}

