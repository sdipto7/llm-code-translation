
import java.util.*;

public class atcoder_ABC150_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = scanner.nextInt();
        scanner.nextLine();

        Set<Integer> numSet = new HashSet<>();
        String[] inputs = scanner.nextLine().split(" ");
        for (String input : inputs) {
            numSet.add(Integer.parseInt(input));
        }

        Set<Integer> twoTimesSet = new HashSet<>();

        for (int current : numSet) {
            int temp = current;
            boolean found = false;
            for (int j = 1; j <= 29; j++) {
                temp /= 2;
                if (temp % 2 != 0) {
                    twoTimesSet.add(j);
                    found = true;
                    break;
                }
            }
            if (twoTimesSet.size() != 1) {
                System.out.println(0);
                return;
            }
        }

        List<Integer> numList = new ArrayList<>(numSet);
        int lcm = numList.get(0);
        for (int i = 1; i < numList.size(); i++) {
            lcm = (lcm * numList.get(i)) / gcd(lcm, numList.get(i));
        }

        int result = (num - lcm / 2) / lcm + 1;
        System.out.println(result);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

