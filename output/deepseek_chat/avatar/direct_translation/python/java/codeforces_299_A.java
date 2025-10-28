import java.util.*;
import java.io.*;

public class codeforces_299_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(a);
        boolean flag = false;
        for (int x : a) {
            if (x % a[0] != 0) {
                flag = true;
                break;
            }
        }
        System.out.println(flag ? -1 : a[0]);
    }
}
