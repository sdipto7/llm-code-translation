
import java.util.*;

public class s770408311 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextLine());
        }
        System.out.println(set.size());
    }
}

