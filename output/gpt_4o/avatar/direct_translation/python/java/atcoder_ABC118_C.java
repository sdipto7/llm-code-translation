
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class atcoder_ABC118_C {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int gcdList(List<Integer> list) {
        return list.stream().reduce(0, (a, b) -> gcd(a, b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<Integer> A = new ArrayList<>();
        for (String s : sc.nextLine().split(" ")) {
            A.add(Integer.parseInt(s));
        }
        int gcd = gcdList(A);
        System.out.println(gcd);
    }
}

