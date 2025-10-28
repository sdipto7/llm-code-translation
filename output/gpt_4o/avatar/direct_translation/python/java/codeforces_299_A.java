
import java.util.*;
import java.io.*;

public class codeforces_299_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); 
        int[] a = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .sorted()
                        .toArray();
        boolean anyNotDivisible = false;
        for (int x : a) {
            if (x % a[0] != 0) {
                anyNotDivisible = true;
                break;
            }
        }
        System.out.println(anyNotDivisible ? -1 : a[0]);
    }
}

