import java.util.*;

public class s768331281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        scanner.nextLine();
        
        List<String> S = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            S.add(scanner.nextLine().trim());
        }
        
        Collections.sort(S);
        StringBuilder result = new StringBuilder();
        for (String str : S) {
            result.append(str);
        }
        
        System.out.println(result.toString());
    }
}
