
import java.util.*;

public class s977408144 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        scanner.nextLine();
        
        List<String> S = new ArrayList<>();
        for (int a = 0; a < n; a++) {
            S.add(scanner.nextLine());
        }
        
        Collections.sort(S);
        StringBuilder result = new StringBuilder();
        for (String s : S) {
            result.append(s);
        }
        System.out.println(result.toString());
    }
}

