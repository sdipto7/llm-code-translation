
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_265_B {

    public static int calculateSteps(int n, List<Integer> numbers) {
        List<Integer> l = new ArrayList<>();
        int ans = n - 1;
        int last = 0;

        for (int i : numbers) {
            l.add(i);
        }

        for (int i : l) {
            ans += Math.abs(last - i) + 1;
            last = i;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(scanner.nextLine()));
        }

        int result = calculateSteps(n, numbers);
        System.out.println(result);
    }
}

