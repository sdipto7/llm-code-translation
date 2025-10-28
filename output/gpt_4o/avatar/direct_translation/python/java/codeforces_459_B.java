
import java.util.*;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> l1 = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            l1.add(Integer.parseInt(s));
        }
        Collections.sort(l1);
        int a = l1.get(l1.size() - 1);
        int b = l1.get(0);
        if (a == b) {
            System.out.println((a - b) + " " + (n * (n - 1) / 2));
        } else {
            long ac = l1.stream().filter(x -> x == a).count();
            long bc = l1.stream().filter(x -> x == b).count();
            System.out.println((a - b) + " " + (ac * bc));
        }
    }
}

