
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class atcoder_ABC174_C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int k = Integer.parseInt(reader.readLine().trim());

        int t = 0;
        boolean found = false;
        
        for (int i = 1; i <= k; i++) {
            t = (t % k) * 10 + 7;
            if (t % k == 0) {
                System.out.println(i);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println(-1);
        }
    }
}

