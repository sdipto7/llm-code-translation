
import java.util.*;
import java.math.*;

public class atcoder_ABC150_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numSet.add(sc.nextInt());
        }
        Set<Integer> twoTimesSet = new HashSet<>();
        boolean flag = true;
        for (int i : numSet) {
            for (int j = 1; j < 30; j++) {
                i /= 2;
                if (i % 2 != 0) {
                    twoTimesSet.add(j);
                    break;
                }
            }
            if (twoTimesSet.size() != 1) {
                System.out.println(0);
                flag = false;
                break;
            }
        }
        if (flag) {
            List<Integer> numList = new ArrayList<>(numSet);
            int lcm = numList.get(0);
            for (int i = 1; i < numList.size(); i++) {
                lcm = lcm * numList.get(i) / gcd(lcm, numList.get(i));
            }
            System.out.println((num - lcm / 2) / lcm + 1);
        }
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

