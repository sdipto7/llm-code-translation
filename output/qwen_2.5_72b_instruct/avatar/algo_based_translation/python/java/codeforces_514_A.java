
import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        String st = "";
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }
            for (int j = 0; j < ip.length(); j++) {
                char i = ip.charAt(j);
                if (Character.getNumericValue(i) > 4) {
                    int n = 9 - Character.getNumericValue(i);
                    st += String.valueOf(n);
                } else {
                    st += String.valueOf(i);
                }
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
    }
}

