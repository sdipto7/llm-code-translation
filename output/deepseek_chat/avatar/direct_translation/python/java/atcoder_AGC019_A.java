orkaTo translate the given Python code into Java, we need to ensure that the logic and functionality are preserved. Here is the corresponding Java code:


import java.util.*;

public class atcoder_AGC019_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        
        int best1L = Math.min(q * 4, Math.min(h * 2, s));
        int best2L = Math.min(d, best1L * 2);
        
        if (n % 2 == 0) {
            System.out.println(best2L * (n / 2));
        } else {
            System.out.println(best2L * (n / 2) + best1L);
        }
    }
}


This Java code performs the same operations as the Python code, including reading input, calculating the best prices for 1L and 2L, and determining the total cost based on the value of `n`.
