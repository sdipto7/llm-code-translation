
import java.util.Scanner;

public class s869207096 {

    public static int countDistinctAdjacentCharacters(int n, String s) {
        int cnt = 1;
        
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                continue;
            } else {
                cnt++;
            }
        }
        
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        String s = scanner.nextLine();
        
        int result = countDistinctAdjacentCharacters(n, s);
        System.out.println(result);
        
        scanner.close();
    }
}

