import java.util.HashSet;
import java.util.Scanner;

public class s131946120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scanner.next());
        }
        System.out.println(set.size());
    }
}
