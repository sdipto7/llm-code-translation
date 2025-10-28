
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class atcoder_ABC114_C {
    private static int N;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        System.out.println(aaa("0"));
    }
    
    private static int aaa(String n) {
        int num = Integer.parseInt(n);
        if (num > N) {
            return 0;
        }
        
        Set<Character> digits = new HashSet<>();
        for (char c : n.toCharArray()) {
            digits.add(c);
        }
        
        Set<Character> target = new HashSet<>();
        target.add('7');
        target.add('5');
        target.add('3');
        
        int ans = digits.equals(target) ? 1 : 0;
        
        for (char i : "753".toCharArray()) {
            ans += aaa(n + i);
        }
        
        return ans;
    }
}

