
import java.util.*;

public class atcoder_ABC155_E {
    static int mod = 1000000007;
    static boolean isTest = false;
    
    public static void pa(Object v) {
        if (isTest) {
            System.out.println(v);
        }
    }
    
    public static int main_b(String s) {
        int pp = 0;
        int na = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(s.length() - 1 - i);
            int cc = na + (c - '0');
            na = 0;
            if (cc <= 4) {
                pp += cc;
            } else {
                na = 1;
                if (i == s.length() - 1) {
                    pp += 1;
                }
                pp += 10 - cc;
            }
        }
        System.out.println(pp);
        return 0;
    }
    
    public static int main(String s) {
        int pmin = 1000;
        int mmin = 0;
        s = '0' + s;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(s.length() - 1 - i);
            int v = c - '0';
            int npmin = Math.min(pmin + 10 - (v + 1), mmin + 10 - v);
            int nmmin = Math.min(pmin + v + 1, mmin + v);
            pmin = npmin;
            mmin = nmmin;
        }
        return Math.min(pmin, mmin);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int ret = main(s);
        if (ret != -1) {
            System.out.println(ret);
        }
    }
}

