import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class atcoder_ABC150_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = scanner.nextInt();
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < num; i++) {
            numSet.add(scanner.nextInt());
        }
        Set<Integer> twoTimesSet = new HashSet<>();
        for (int i : numSet) {
            int temp = i;
            for (int j = 1; j < 30; j++) {
                temp /= 2;
                if (temp % 2 != 0) {
                    twoTimesSet.add(j);
                    break;
                }
            }
            if (twoTimesSet.size() != 1) {
                System.out.println(0);
                return;
            }
        }
        Integer[] numList = numSet.toArray(new Integer[0]);
        int lcm = numList[0];
        for (int i = 1; i < numList.length; i++) {
            lcm = lcm * numList[i] / gcd(lcm, numList[i]);
        }
        System.out.println((num - lcm / 2) / (lcm) + 1);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
