
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();
        
        List<Integer> list1 = getNums(k, sk);
        List<Integer> list2 = getNums(n - k, sa - sk);
        
        List<Integer> ans = new ArrayList<>(list1);
        ans.addAll(list2);
        
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < ans.size(); i++) {
            if (i > 0) output.append(" ");
            output.append(ans.get(i));
        }
        System.out.println(output);
    }
    
    private static List<Integer> getNums(int num, int t) {
        int quotient = t / num;
        int remainder = t % num;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            result.add(i < remainder ? quotient + 1 : quotient);
        }
        return result;
    }
}

