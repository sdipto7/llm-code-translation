
import java.util.Scanner;

public class atcoder_ABC155_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = "0" + s;
        String reversed = new StringBuilder(s).reverse().toString();
        int pmin = 1000;
        int mmin = 0;
        
        for (int i = 0; i < reversed.length(); i++) {
            int v = Character.getNumericValue(reversed.charAt(i));
            int npmin = Math.min(pmin + 10 - (v + 1), mmin + 10 - v);
            int nmmin = Math.min(pmin + (v + 1), mmin + v);
            pmin = npmin;
            mmin = nmmin;
        }
        
        System.out.println(Math.min(pmin, mmin));
    }
}

