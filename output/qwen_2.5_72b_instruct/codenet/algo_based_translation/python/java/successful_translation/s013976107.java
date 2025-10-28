import java.util.Scanner;

public class s013976107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String input = scanner.nextLine();
        char[] S = input.toCharArray();
        
        if (S[A] == '-' && countHyphens(S) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    private static int countHyphens(char[] array) {
        int count = 0;
        for (char c : array) {
            if (c == '-') {
                count++;
            }
        }
        return count;
    }
}
