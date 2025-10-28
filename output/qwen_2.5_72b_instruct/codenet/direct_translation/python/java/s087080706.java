import java.util.*;
public class s087080706 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        Collections.sort(a);
        int i = Collections.binarySearch(a, x);
        if (i < 0) {
            i = ~i;
        }
        System.out.println(Math.min(i, a.size() - i));
    }
}
