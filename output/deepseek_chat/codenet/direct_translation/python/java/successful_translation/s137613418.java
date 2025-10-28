
import java.util.*;

public class s137613418 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = load(sc);
        List<Integer> A = loadList(sc);
        Set<Integer> set = new HashSet<>(A);
        if (n == set.size()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static int load(Scanner sc) {
        return Integer.parseInt(sc.nextLine().trim());
    }

    static List<Integer> loadList(Scanner sc) {
        String[] parts = sc.nextLine().trim().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String part : parts) {
            list.add(Integer.parseInt(part));
        }
        return list;
    }
}

