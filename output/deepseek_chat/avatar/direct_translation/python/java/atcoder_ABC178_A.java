itoreimport java.util.Scanner;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tcs = 1;
        int tc = 1;
        while (tc <= tcs) {
            solve(scanner);
            tc++;
        }
    }

    public static void solve(Scanner scanner) {
        int a = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(a == 0 ? 1 : 0);
    }
}
