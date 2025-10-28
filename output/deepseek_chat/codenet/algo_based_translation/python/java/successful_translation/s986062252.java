
import java.util.*;
import java.util.function.Function;

public class s986062252 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Integer> inputList = il(scanner, Integer::valueOf);
        int n = inputList.get(0);
        int m = inputList.get(1);
        
        String s = scanner.nextLine().trim();
        String t = scanner.nextLine().trim();
        
        int aa = gcd(n, m);
        int bb = lcm(n, m);
        int cc = aa / bb;
        
        for (int i = 0; i < aa; i++) {
            if (s.charAt(n / aa * i) != t.charAt(m / aa * i)) {
                System.out.println(-1);
                return;
            }
        }
        
        System.out.println(bb);
    }
    
    private static List<Integer> il(Scanner scanner, Function<String, Integer> func) {
        String[] tokens = scanner.nextLine().trim().split("\\s+");
        List<Integer> result = new ArrayList<>();
        for (String token : tokens) {
            result.add(func.apply(token));
        }
        return result;
    }
    
    private static int gcd(int a, int b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}

