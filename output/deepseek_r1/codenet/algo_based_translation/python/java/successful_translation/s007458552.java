
import java.util.Scanner;

public class s007458552 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        int countR = 0;
        for (char c : S.toCharArray()) {
            if (c == 'R') countR++;
        }
        System.out.println(countR > n - countR ? "Yes" : "No");
    }
}

