
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Optional;
import java.util.stream.IntStream;

public class s817205687 {
    public static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }

    public static int lcmList(List<Integer> numbers) {
        return numbers.stream().reduce(1, Main::lcm);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt() / 2);
        }

        Optional<Integer> countDiv2 = Optional.empty();
        for (int a : A) {
            int cnt = 0;
            while (a % 2 == 0) {
                a /= 2;
                cnt++;
            }
            if (!countDiv2.isPresent()) {
                countDiv2 = Optional.of(cnt);
            } else if (cnt != countDiv2.get()) {
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

