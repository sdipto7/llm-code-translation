
import java.util.*;

public class s977408144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        sc.nextLine();
        String[] S = new String[n];
        for (int i = 0; i < n; i++) {
            S[i] = sc.nextLine();
        }
        Arrays.sort(S);
        StringBuilder ans = new StringBuilder();
        for (String s : S) {
            ans.append(s);
        }
        System.out.println(ans.toString());
    }
}

