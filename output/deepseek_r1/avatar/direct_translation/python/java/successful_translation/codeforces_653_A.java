
import java.util.*;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] parts = scanner.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String part : parts) {
            list.add(Integer.parseInt(part));
        }
        Collections.sort(list);
        Set<Integer> set = new HashSet<>(list);
        for (int num : list) {
            if (set.contains(num + 1) && set.contains(num + 2)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}

