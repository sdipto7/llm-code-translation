
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeforces_629_B {
    public static void main(String[] args) throws IOException {
        final int N = 368;
        int[] m = new int[N];
        int[] f = new int[N];
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            String[] tokens = br.readLine().trim().split(" ");
            String gender = tokens[0];
            int startDay = Integer.parseInt(tokens[1]);
            int endDay = Integer.parseInt(tokens[2]) + 1;
            
            startDay = Math.min(Math.max(startDay, 0), N - 1);
            endDay = Math.min(Math.max(endDay, 0), N - 1);
            
            if (gender.equals("M")) {
                m[startDay] += 2;
                m[endDay] -= 2;
            } else {
                f[startDay] += 2;
                f[endDay] -= 2;
            }
        }
        
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < N; i++) {
            a += m[i];
            b += f[i];
            c = Math.max(c, Math.min(a, b));
        }
        
        System.out.println(c);
    }
}

