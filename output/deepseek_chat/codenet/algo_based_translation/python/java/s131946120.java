import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class s131946120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            stringSet.add(input);
        }
        System.out.println(stringSet.size());
    }
}
