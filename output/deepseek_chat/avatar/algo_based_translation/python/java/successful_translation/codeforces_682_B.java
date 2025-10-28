import java.util.*;
import java.io.*;

public class codeforces_682_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] tokens = br.readLine().split(" ");
        int[] l = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            l[i] = Integer.parseInt(tokens[i]);
        }
        int f = 1;
        Arrays.sort(l);
        int c = 0;
        for (int i : l) {
            if (i > c) {
                c++;
            }
        }
        System.out.println(c + 1);
    }
}
