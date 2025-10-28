import java.util.Scanner;

public class s893778513 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        int s = 0;
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
            s += l[i];
        }
        int b = l[0];
        for (int i = 1; i < n; i++) {
            if (l[i] > b) {
                b = l[i];
            }
        }
        if (b < s - b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
