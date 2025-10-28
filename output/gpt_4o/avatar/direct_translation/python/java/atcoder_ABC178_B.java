
import java.util.*;
import java.io.*;

public class atcoder_ABC178_B {
    static int inf = (int) Math.pow(10, 20);
    static int mod = (int) Math.pow(10, 9) + 7;
    static int[][] dd = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int[][] ddn = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(Math.max(Math.max(a * c, b * d), Math.max(a * d, b * c)));
    }
}

