
import java.util.*;

public class s768331281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int N = Integer.parseInt(parts[0]);
        int L = Integer.parseInt(parts[1]);
        
        ArrayList<String> S = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            S.add(scanner.nextLine().replaceAll("\\s+$", ""));
        }
        
        Collections.sort(S);
        
        StringBuilder result = new StringBuilder();
        for (String s : S) {
            result.append(s);
        }
        
        System.out.println(result.toString());
    }
}

