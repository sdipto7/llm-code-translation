import java.util.Scanner;

public class atcoder_ABC178_A {
    public static void solve(int tc) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine().trim());
        if (a == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    
    public static void main(String[] args) {
        int tcs = 1;
        int tc = 1;
        while (tc <= tcs) {
            solve(tc);
            tc++;
        }
    }
}
