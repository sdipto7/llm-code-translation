
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class codeforces_369_B {

    public static List<Integer> getNums(int num, int t) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if (i < t % num) {
                result.add(t / num + 1);
            } else {
                result.add(t / num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();

        List<Integer> ans = new ArrayList<>();
        ans.addAll(getNums(k, sk));
        ans.addAll(getNums(n - k, sa - sk));

        String result = ans.stream()
                           .map(String::valueOf)
                           .collect(Collectors.joining(" "));
        System.out.println(result);

        scanner.close();
    }
}

