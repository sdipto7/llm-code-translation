
import java.util.Scanner;

public class s557080041 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1
        String N = scanner.nextLine();
        
        // Step 2
        if (N.equals("0")) {
            System.out.println("Yes");
        } else {
            // Step 3
            // N is already a string

            // Step 4 and 5
            int[] L = new int[N.length()];
            for (int i = 0; i < N.length(); i++) {
                L[i] = Character.getNumericValue(N.charAt(i));
            }
            
            // Step 6
            int X = 0;
            for (int num : L) {
                X += num;
            }
            
            // Step 7
            if (X % 9 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
        scanner.close();
    }
}

