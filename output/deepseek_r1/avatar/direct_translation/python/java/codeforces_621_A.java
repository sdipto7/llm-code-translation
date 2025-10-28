
import java.util.*;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(scanner.nextInt());
        }
        Collections.sort(lst, Collections.reverseOrder());
        int od = 0;
        for (int num : lst) {
            if (num % 2 != 0) {
                od++;
            }
        }
        int sum = 0;
        boolean ok = false;
        for (int i = 0; i < lst.size(); i++) {
            int current = lst.get(i);
            if (current % 2 == 0) {
                sum += current;
            } else {
                if (ok || od > 1) {
                    sum += current;
                    od--;
                    ok = !ok;
                }
            }
        }
        System.out.println(sum);
    }
}

