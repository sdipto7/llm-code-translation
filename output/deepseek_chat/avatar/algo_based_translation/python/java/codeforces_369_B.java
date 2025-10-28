
import java.util.*;

public class codeforces_369_B {
    public static List<Integer> getNums(int num, int t) {
        List<Integer> result = new ArrayList<>();
        int baseValue = t / num;
        int remainder = t % num;
        for (int i = 0; i < num; i++) {
            if (i < remainder) {
                result.add(baseValue + 1);
            } else {
                result.add(baseValue);
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
        
        List<Integer> firstPart = getNums(k, sk);
        List<Integer> secondPart = getNums(n - k, sa - sk);
        
        List<Integer> ans = new ArrayList<>();
        ans.addAll(firstPart);
        ans.addAll(secondPart);
        
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < ans.size(); i++) {
            if (i > 0) output.append(" ");
            output.append(ans.get(i));
        }
        System.out.println(output);
    }
}

