
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class atcoder_ABC158_B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int I() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    static int[] MI() throws IOException {
        st = new StringTokenizer(br.readLine());
        return new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
    }

    public static void main(String[] args) throws IOException {
        int mod = 1000000007;
        int[] input = MI();
        int N = input[0], A = input[1], B = input[2];
        int ans = 0;
        int rep = N / (A + B);
        ans += rep * A;
        int res = N - rep * (A + B);
        ans += Math.min(res, A);
        System.out.println(ans);
    }
}

