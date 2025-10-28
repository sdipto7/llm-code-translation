
import java.util.Arrays;
import java.util.Scanner;

public class s441329208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        Arrays.sort(s);
        Arrays.sort(t);
        String sStr = new String(s);
        String tStr = new StringBuilder(new String(t)).reverse().toString();
        System.out.println(sStr.compareTo(tStr) < 0 ? "Yes" : "No");
    }
}

