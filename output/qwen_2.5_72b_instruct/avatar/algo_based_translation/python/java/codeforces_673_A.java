
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_673_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        if (arr.get(0) > 15) {
            System.out.println(15);
        } else {
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i) - arr.get(i - 1) > 15) {
                    System.out.println(arr.get(i - 1) + 15);
                    break;
                }
            }
            if (arr.get(arr.size() - 1) == 90 || arr.get(arr.size() - 1) + 15 >= 90) {
                System.out.println(90);
            } else {
                System.out.println(arr.get(arr.size() - 1) + 15);
            }
        }
        scanner.close();
    }
}

