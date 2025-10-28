
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();
        scanner.close();

        List<Integer> ans = getNums(k, sk);
        ans.addAll(getNums(n - k, sa - sk));

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < ans.size(); i++) {
            output.append(ans.get(i));
            if (i < ans.size() - 1) {
                output.append(" ");
            }
        }
        System.out.println(output.toString());
    }

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
}

