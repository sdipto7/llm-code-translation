
import java.util.*;
import java.math.BigInteger;

public class s817205687 {
    public static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    public static int lcmList(List<Integer> numbers) {
        return numbers.stream().reduce(1, Main::lcm);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }
        
        for (int i = 0; i < A.size(); i++) {
            A.set(i, A.get(i) / 2);
        }
        
        Integer countDiv2 = null;
        for (int num : A) {
            int cnt = 0;
            int temp = num;
            while (temp % 2 == 0) {
                temp /= 2;
                cnt++;
            }
            if (countDiv2 == null) {
                countDiv2 = cnt;
            } else if (cnt != countDiv2) {
                System.out.println(0);
                return;
            }
        }
        
        int myLcm = lcmList(A);
        if (myLcm > M) {
            System.out.println(0);
            return;
        }
        
        int tmp = M / myLcm;
        int ans = (tmp + 1) / 2;
        System.out.println(ans);
    }
}

