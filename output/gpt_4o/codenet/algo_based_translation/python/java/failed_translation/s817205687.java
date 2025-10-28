
import java.util.*;
import java.util.stream.Collectors;

public class s817205687 {
    
    public static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }

    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
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

        A = A.stream().map(a -> a / 2).collect(Collectors.toList());

        Integer countDiv2 = null;
        for (int a : A) {
            int cnt = 0;
            while (a % 2 == 0) {
                a /= 2;
                cnt++;
            }
            if (countDiv2 == null) {
                countDiv2 = cnt;
            } else if (!cnt.equals(countDiv2)) {
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

