import java.util.*;
import java.io.*;

public class s441329208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().trim().toCharArray();
        char[] t = br.readLine().trim().toCharArray();
        Arrays.sort(s);
        Arrays.sort(t);
        for (int i = 0; i < t.length / 2; i++) {
            char temp = t[i];
            t[i] = t[t.length - 1 - i];
            t[t.length - 1 - i] = temp;
        }
        boolean less = true;
        int minLength = Math.min(s.length, t.length);
        for (int i = 0; i < minLength; i++) {
            if (s[i] < t[i]) {
                less = true;
                break;
            } else if (s[i] > t[i]) {
                less = false;
                break;
            }
            if (i == minLength - 1) {
                less = s.length < t.length;
            }
        }
        System.out.println(less ? "Yes" : "No");
    }
}
