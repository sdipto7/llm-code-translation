
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class codeforces_134_A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(reader.readLine().trim());
        String[] input = reader.readLine().trim().split("\\s+");
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = Integer.parseInt(input[i]);
        }
        
        int x = 0;
        for (int value : w) {
            x += value;
        }
        
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ((x - w[i]) / (n - 1.0) == w[i]) {
                d.add(i + 1);
            }
        }
        
        System.out.println(d.size());
        for (int i = 0; i < d.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(d.get(i));
        }
        System.out.println();
    }
}

