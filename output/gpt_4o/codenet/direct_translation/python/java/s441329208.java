
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class s441329208 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] s = reader.readLine().trim().toCharArray();
        char[] t = reader.readLine().trim().toCharArray();
        Arrays.sort(s);
        Arrays.sort(t);
        for (int i = 0; i < t.length / 2; i++) {
            char temp = t[i];
            t[i] = t[t.length - i - 1];
            t[t.length - i - 1] = temp;
        }
        System.out.println(new String(s).compareTo(new String(t)) < 0 ? "Yes" : "No");
    }
}

