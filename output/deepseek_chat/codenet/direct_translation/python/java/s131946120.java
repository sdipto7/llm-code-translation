import java.util.HashSet;
import java.util.Scanner;

public class s131946120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextLine());
        }
        System.out.println(set.size());
    }
}
