
import java.util.*;
import java.util.Scanner;

public class atcoder_ABC140_D {
    private static Iterator<String> inputParser;
    
    public static void main(String[] args) {
        inputParser = parser().iterator();
        final int MOD = 1000000007;
        int N = gi();
        int K = gi();
        String S = gw();
        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }
        int cur_happy = N - 1 - seg_cnt;
        int ans;
        if (2 * K >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = cur_happy + 2 * K;
        }
        System.out.println(ans);
    }
    
    private static Iterable<String> parser() {
        return () -> new Iterator<String>() {
            private Scanner sc = new Scanner(System.in);
            private Queue<String> tokens = new LinkedList<>();
            
            public boolean hasNext() {
                return true;
            }
            
            public String next() {
                while (tokens.isEmpty()) {
                    String line = sc.nextLine();
                    String[] parts = line.split(" ");
                    for (String part : parts) {
                        if (part.length() > 0) {
                            tokens.add(part);
                        }
                    }
                }
                return tokens.poll();
            }
        };
    }
    
    private static String gw() {
        return inputParser.next();
    }
    
    private static int gi() {
        return Integer.parseInt(gw());
    }
}

