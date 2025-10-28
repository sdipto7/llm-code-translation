
import java.util.Scanner;

public class s199418121 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input Operations
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        String AString = parts[0];
        String BString = parts[1];
        
        // Data Processing
        int A = Integer.parseInt(AString);
        int B = Integer.parseInt(BString.replace(".", ""));
        
        // Arithmetic Operations
        int result = A * B / 100;
        
        // Output Operations
        System.out.println(result);
        
        scanner.close();
    }
}

