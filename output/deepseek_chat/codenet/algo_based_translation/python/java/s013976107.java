
import java.util.Scanner;

public class s013976107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        char[] S = input.toCharArray();
        
        if (S[A] == '-' && countDashes(S) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    private static int countDashes(char[] arr) {
        int count = 0;
        for (char c : arr) {
            if (c == '-') {
                count++;
            }
        }
        return count;
    }
}

