import java.util.Scanner;

public class s813548165 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            result.append(S.charAt(i));
            result.append(T.charAt(i));
        }
        
        System.out.println(result.toString());
    }
}
