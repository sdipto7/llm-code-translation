
import java.util.Scanner;

public class s869207096 {
    public static void main(String[] args) {
        countSegments();
    }

    public static void countSegments() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String s = scanner.nextLine();
        int cnt = 1;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                continue;
            } else {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}

