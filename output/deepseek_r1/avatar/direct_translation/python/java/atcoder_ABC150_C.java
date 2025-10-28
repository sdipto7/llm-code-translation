
import java.util.*;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        List<Integer> p = parseList(scanner.nextLine());
        List<Integer> q = parseList(scanner.nextLine());
        List<Integer> current = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            current.add(i);
        }
        int pIndex = -1;
        int qIndex = -1;
        int index = 0;
        do {
            if (current.equals(p)) {
                pIndex = index;
            }
            if (current.equals
