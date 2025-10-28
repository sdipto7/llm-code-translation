import java.util.*;

public class s735480710 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.next());
        }
        List<String> b = new ArrayList<>(a.subList(1, n).stream().skip(1).collect(Collectors.toList()));
        Collections.reverse(b);
        b.addAll(a.subList(0, n).stream().filter((s, i) -> i % 2 == 0).collect(Collectors.toList()));
        if (n % 2 == 0) {
            System.out.println(String.join(" ", b));
        } else {
            Collections.reverse(b);
            System.out.println(String.join(" ", b));
        }
    }
}
