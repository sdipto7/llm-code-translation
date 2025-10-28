
import java.util.*;
import java.io.*;
import java.math.*;

public class atcoder_ABC169_C {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> environ = System.getenv();
        
        java.util.function.Consumer<Object[]> dbg = (something) -> {
            if (environ.containsKey("TERM_PROGRAM")) {
                for (Object obj : something) {
                    System.out.print(obj + " ");
                }
                System.out.println();
            }
        };
        
        java.util.function.Supplier<String> input = () -> {
            try {
                return stdin.readLine().trim();
            } catch (IOException e) {
                return "";
            }
        };
        
        java.util.function.Supplier<int[]> LMIIS = () -> {
            String[] parts = input.get().split(" ");
            int[] result = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                result[i] = Integer.parseInt(parts[i]);
            }
            return result;
        };
        
        java.util.function.Supplier<Integer> II = () -> {
            return Integer.parseInt(input.get());
        };
        
        final int P = 1000000007;
        final int INF = 1000000010;
        
        String[] inputParts = input.get().split(" ");
        String sa = inputParts[0];
        String sb = inputParts[1];
        
        int a = Integer.parseInt(sa);
        double temp = Double.parseDouble(sb);
        int b = (int)(temp * 100 + 0.1);
        
        System.out.println((a * b) / 100);
    }
}

