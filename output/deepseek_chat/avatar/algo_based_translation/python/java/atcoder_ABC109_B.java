import java.util.*;
import java.util.function.Supplier;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> s = new HashMap<>();
        List<String> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(scanner.nextLine());
        }
        String f = "Yes";
        int index = -1;
        
        for (String v : l) {
            s.put(v, s.getOrDefault(v, 0) + 1);
            if (s.get(v) >= 2) {
                f = "No";
            }
            if (index != -1 && l.get(index).charAt(l.get(index).length() - 1) != v.charAt(0)) {
                f = "No";
            }
            index++;
        }
        
        System.out.println(f);
    }
}
