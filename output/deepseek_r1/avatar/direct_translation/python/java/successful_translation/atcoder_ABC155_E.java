
import java.util.Scanner;

public class atcoder_ABC155_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        s = "0" + s;
        int pmin = 1000;
        int mmin = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int v = Character.getNumericValue(s.charAt(i));
            int npmin = Math.min(pmin + 10 - (v + 1), mmin + 10 - v);
            int nmmin = Math.min(pmin + v + 1, mmin + v);
            pmin = npmin;
            mmin = nmmin;
        }
        System.out.println(Math.min(pmin, mmin));
    }
}

