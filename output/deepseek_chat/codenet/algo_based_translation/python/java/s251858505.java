
import java.util.Scanner;

public class s251858505 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        int result = 0;
        
        for (int i = 0; i < Math.min(input1.length(), input2.length()); i++) {
            if (input1.charAt(i) == input2.charAt(i)) {
                result++;
            }
        }
        
        System.out.println(result);
        scanner.close();
    }
}

