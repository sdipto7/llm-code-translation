
import java.util.*;

public class s770408311 {
    public static void main(String[] args) {
        System.out.println(countUniqueStrings());
    }

    public static int countUniqueStrings() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String a = scanner.nextLine();
            res.add(a);
        }
        Set<String> uniqueStrings = new HashSet<>(res);
        int count = uniqueStrings.size();
        System.out.println(count);
        return count;
    }
}

