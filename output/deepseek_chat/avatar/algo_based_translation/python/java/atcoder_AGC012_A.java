
import java.util.*;
import java.math.*;
import java.io.*;

public class atcoder_AGC012_A {
    static final int mod = 1000000007;
    
    static ArrayList<Integer> readInts() {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(" ");
        ArrayList<Integer> result = new ArrayList<>();
        for (String token : tokens) {
            result.add(Integer.parseInt(token));
        }
        return result;
    }
    
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> A = readInts();
        Collections.sort(A);
        int ans = 0;
        for (int i = A.size() - 2; i >= A.size() - 2 * n - 1; i -= 2) {
            ans += A.get(i);
        }
        System.out.println(ans);
    }
    
    public static void main(String[] args) {
        main();
    }
}

