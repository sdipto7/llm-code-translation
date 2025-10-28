
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class s768331281 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int L = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        List<String> S = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine().trim();
            S.add(str);
        }

        Collections.sort(S);

        StringBuilder result = new StringBuilder();
        for (String str : S) {
            result.append(str);
        }

        System.out.println(result.toString());

        scanner.close();
    }
}

