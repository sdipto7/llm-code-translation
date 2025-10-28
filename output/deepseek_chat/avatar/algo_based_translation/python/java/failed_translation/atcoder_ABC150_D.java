
import java.util.*;
import java.math.BigInteger;

public class atcoder_ABC150_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int num = scanner.nextInt();
        scanner.nextLine();
        
        Set<Integer> numSet = new HashSet<>();
        String[] inputArray = scanner.nextLine().split(" ");
        for (String s : inputArray) {
            numSet.add(Integer.parseInt(s));
        }
        
        Set<Integer> twoTimesSet = new HashSet<>();
        boolean breakOuter = false;
        
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
                breakOuter = true;
                break;
            }
        }
        
        if (!breakOuter) {
            List<Integer> numList = new ArrayList<>(numSet);
            long lcm = numList.get(0);
            
            for (int i = 1; i < numList.size(); i++) {
                long current = numList.get(i);
                long gcd = BigInteger.valueOf(lcm).gcd(BigInteger.valueOf(current)).longValue();
                lcm = (lcm * current) / gcd;
            }
            
            long result = (num - lcm / 2) / lcm + 1;
            System.out.println(result);
        }
    }
}

