
import java.util.*;

public class s770408311 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String a = scanner.nextLine();
            res.add(a);
        }
        Set<String> unique = new HashSet<>(res);
        System.out.println(unique.size());
    }
}

