
import java.util.*;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> lst = new ArrayList<>();
        String[] inputElements = scanner.nextLine().split(" ");
        for (String elem : inputElements) {
            lst.add(Integer.parseInt(elem));
        }

        Collections.sort(lst, Collections.reverseOrder());

        int od = 0;
        for (int i : lst) {
            if ((i & 1) == 1) {
                od++;
            }
        }

        int sum = 0;
        int ok = 0;
        for (int i = 0; i < n; i++) {
            if (lst.get(i) % 2 == 0) {
                sum += lst.get(i);
            } else {
                if (ok == 1 || od > 1) {
                    sum += lst.get(i);
                    od--;
                    ok = 1 - ok; // Toggle ok between 0 and 1
                }
            }
        }

        System.out.println(sum);
        scanner.close();
    }
}

