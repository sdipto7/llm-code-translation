
import java.util.*;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> lst = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            lst.add(Integer.parseInt(input[i]));
        }
        Collections.sort(lst, Collections.reverseOrder());
        int od = 0;
        for (int i : lst) {
            if ((i & 1) == 1) {
                od += 1;
            }
        }
        int sum = 0;
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            if (lst.get(i) % 2 == 0) {
                sum += lst.get(i);
            } else {
                if (ok || od > 1) {
                    sum += lst.get(i);
                    od -= 1;
                    ok = !ok;
                }
            }
        }
        System.out.println(sum);
    }
}

