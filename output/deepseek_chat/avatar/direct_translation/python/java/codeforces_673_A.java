import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class codeforces_673_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Integer> arr = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            arr.add(Integer.parseInt(s));
        }
        if (arr.get(0) > 15) {
            System.out.println(15);
        } else {
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i) - arr.get(i - 1) > 15) {
                    System.out.println(arr.get(i - 1) + 15);
                    return;
                }
            }
            if (arr.get(arr.size() - 1) == 90 || arr.get(arr.size() - 1) + 15 >= 90) {
                System.out.println(90);
            } else {
                System.out.println(arr.get(arr.size() - 1) + 15);
            }
        }
    }
}
