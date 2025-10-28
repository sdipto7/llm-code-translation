
import java.util.Scanner;

public class s267172486 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().trim().split("\\s+");
        int h = Integer.parseInt(inputs[0]);
        int a = Integer.parseInt(inputs[1]);
        int ans = h / a;
        int ama = h % a;
        if (ama != 0) {
            ans++;
        }
        System.out.println(ans);
    }
}

