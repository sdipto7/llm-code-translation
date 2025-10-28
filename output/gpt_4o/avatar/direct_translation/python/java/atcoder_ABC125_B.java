
import java.util.Scanner;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String[] VInput = scanner.nextLine().split(" ");
        int[] V = new int[VInput.length];
        for (int i = 0; i < VInput.length; i++) {
            V[i] = Integer.parseInt(VInput[i]);
        }
        String[] CInput = scanner.nextLine().split(" ");
        int[] C = new int[CInput.length];
        for (int i = 0; i < CInput.length; i++) {
            C[i] = Integer.parseInt(CInput[i]);
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (V[i] - C[i] > 0) {
                ans += (V[i] - C[i]);
            }
        }
        System.out.println(ans);
    }
}

