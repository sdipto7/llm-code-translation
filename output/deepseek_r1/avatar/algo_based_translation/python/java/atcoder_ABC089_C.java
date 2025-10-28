
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class atcoder_ABC089_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = br.readLine();
        }
        
        int[] marchCounts = new int[5];
        List<Character> march = Arrays.asList('M', 'A', 'R', 'C', 'H');
        
        for (String s : S) {
            if (s.isEmpty()) continue;
            char firstChar = Character.toUpperCase(s.charAt(0));
            int index = march.indexOf(firstChar);
            if (index != -1) {
                marchCounts[index]++;
            }
        }
        
        long ans = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    ans += (long) marchCounts[i] * marchCounts[j] * marchCounts[k];
                }
            }
        }
        
        System.out.println(ans);
    }
}

