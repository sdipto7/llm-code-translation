
import java.util.*;

public class s137613418 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] parts = sc.nextLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for (String part : parts) {
            set.add(Integer.parseInt(part));
        }
        System.out.println(set.size() == n ? "YES" : "NO");
    }
}

