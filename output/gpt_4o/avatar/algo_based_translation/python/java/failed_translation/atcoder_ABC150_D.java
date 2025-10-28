
import java.util.*;
import java.math.BigInteger;

public class atcoder_ABC150_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int num = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining line
        
        Set<Integer> numSet = new HashSet<>();
        String[] inputNumbers = scanner.nextLine().split(" ");
        for (String number : inputNumbers) {
            numSet.add(Integer.parseInt(number));
        }
        
        Set<Integer> twoTimesSet = new HashSet<>();
        
        outer: for (int i : numSet) {
            int value = i;
            for (int j = 1; j < 30; j++) {
                value /= 2;
                if (value % 2 != 0) {
                    twoTimesSet.add(j);
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
            lcm = lcm(lcm, numList.get(i));
        }
        
        System.out.println((num - lcm / 2) / lcm + 1);
    }
    
    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
    
    private static int gcd(int a, int b) {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }
}

