
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class s977408144 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        scanner.nextLine();
        
        ArrayList<String> S = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            S.add(scanner.nextLine());
        }
        
        Collections.sort(S);
        StringBuilder result = new StringBuilder();
        for (String s : S) {
            result.append(s);
        }
        System.out.println(result.toString());
    }
}

