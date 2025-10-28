
import java.util.Scanner;

public class s251858505 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Read string1 from user input
        String string1 = scanner.nextLine();
        
        // Step 2: Read string2 from user input
        String string2 = scanner.nextLine();
        
        // Step 3: Initialize totalMatchCount to 0
        int totalMatchCount = 0;
        
        // Step 4: Initialize compareResult as an empty list
        // No need for explicit list, will count directly
        
        // Step 5: For each pair of characters (x, y) from string1 and string2 respectively:
        for (int i = 0; i < Math.min(string1.length(), string2.length()); i++) {
            char x = string1.charAt(i);
            char y = string2.charAt(i);
            
            // Step 5a: Check if x is equal to y
            if (x == y) {
                // Step 5b: If equal, increment totalMatchCount
                totalMatchCount++;
            }
            // Step 5c: If not equal, do nothing
        }
        
        // Step 7: Print totalMatchCount
        System.out.println(totalMatchCount);
        
        scanner.close();
    }
}

