
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 3: Read input from the user (not used in logic)
        scanner.nextLine();

        // Step 3: Read second input from the user, split it by spaces into a list of strings
        String[] inputValues = scanner.nextLine().split(" ");
        
        // Step 4: Logic Flow
        List<Integer> L = new ArrayList<>();
        int r = 1;
        
        for (String k : inputValues) {
            int count = Integer.parseInt(k);
            for (int i = 0; i < count; i++) {
                L.add(r);
            }
            r++;
        }
        
        // Step 4: Read another input from the user (not used in logic)
        scanner.nextLine();

        // Step 4: Read a final input from the user, split it by spaces into a list of strings
        String[] indices = scanner.nextLine().split(" ");
        
        // Step 6: Data Processing Logic and Output
        for (String j : indices) {
            int index = Integer.parseInt(j) - 1;
            System.out.println(L.get(index));
        }
        
        scanner.close();
    }
}

