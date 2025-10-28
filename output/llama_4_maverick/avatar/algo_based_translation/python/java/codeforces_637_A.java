
import java.util.*;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = sc.nextLine().trim().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String str : s) {
            w.put(str, w.getOrDefault(str, 0) + 1);
        }
        List<String> list = Arrays.asList(s);
        Collections.reverse(list);
        int c = -1;
        String a = "";
        int maxFreq = Collections.max(w.values());
        for (String i : w.keySet()) {
            if (w.get(i) == maxFreq) {
                if (list.indexOf(i) > c) {
                    a = i;
                    c = list.indexOf(i);
                }
            }
        }
        System.out.println(a);
    }
}

