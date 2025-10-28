import java.util.*;
import java.io.*;

public class codeforces_299_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] input = br.readLine().split(" ");
        int[] a = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(a);
        boolean hasRemainder = false;
        for (int x : a) {
            if (x % a[0] != 0) {
                hasRemainder = true;
                break;
            }
        }
        System.out.println(hasRemainder ? -1 : a[0]);
    }
}
