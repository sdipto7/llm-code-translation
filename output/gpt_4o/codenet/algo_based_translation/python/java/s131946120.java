
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class s131946120 {

    public static void main(String[] args) {
        System.out.println(countUniqueStrings());
    }

    public static int countUniqueStrings() {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1 and 2
        int n = Integer.parseInt(scanner.nextLine());
        
        // Step 3
        Set<String> uniqueStrings = new HashSet<>();
        
        // Step 4
        for (int i = 0; i < n; i++) {
            // Step 4a
            String inputString = scanner.nextLine();
            uniqueStrings.add(inputString);
        }
        
        // Step 6
        int uniqueCount = uniqueStrings.size();
        
        // Step 7
        return uniqueCount;
    }
}

