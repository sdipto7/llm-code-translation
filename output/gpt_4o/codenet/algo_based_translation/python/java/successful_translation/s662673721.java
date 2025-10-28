
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class s662673721 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        long n = Long.parseLong(reader.readLine().trim());
        long ans = (long) Math.pow(10, 18);
        
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (n % i != 0) {
                continue;
            }
            long j = n / i;
            ans = Math.min(ans, i + j - 2);
        }
        
        System.out.println(ans);
    }
}

