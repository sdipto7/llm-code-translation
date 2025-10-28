
import java.util.*;

public class s977408144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        List<String> S = new ArrayList<>();
        for (int a = 0; a < n; a++) {
            S.add(sc.next());
        }
        Collections.sort(S);
        StringBuilder sb = new StringBuilder();
        for (String s : S) {
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
}

