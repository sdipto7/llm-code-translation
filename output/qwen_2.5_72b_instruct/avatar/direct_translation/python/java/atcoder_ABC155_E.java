
import java.util.Scanner;

public class atcoder_ABC155_E {
    static String[] inputMethods = {"clipboard", "file", "key"};
    static int usingMethod = 0;
    static String inputMethod = inputMethods[usingMethod];
    static Scanner scanner = new Scanner(System.in);
    static final int mod = 1000000007;

    public static void main(String[] args) {
        String s = scanner.nextLine();
        int pmin = 1000;
        int mmin = 0;
        s = "0" + s;
        for (int i = s.length() - 1; i >= 0; i--) {
            int v = s.charAt(i) - '0';
            int npmin = Math.min(pmin + 10 - (v + 1), mmin + 10 - v);
            int nmmin = Math.min(pmin + v + 1, mmin + v);
            pmin = npmin;
            mmin = nmmin;
        }
        System.out.println(Math.min(pmin, mmin));
    }

    public static void pa(int v) {
        if (isTest) {
            System.out.println(v);
        }
    }

    public static void inputClipboard() {
        // Implement clipboard input if needed
    }

    static boolean isTest = false;
}

