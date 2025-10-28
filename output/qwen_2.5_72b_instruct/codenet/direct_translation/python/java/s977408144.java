import java.util.*;

public class s977408144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        String[] S = new String[n];
        for (int a = 0; a < n; a++) {
            S[a] = sc.next();
        }
        Arrays.sort(S);
        StringBuilder result = new StringBuilder();
        for (String s : S) {
            result.append(s);
        }
        System.out.println(result.toString());
    }
}
