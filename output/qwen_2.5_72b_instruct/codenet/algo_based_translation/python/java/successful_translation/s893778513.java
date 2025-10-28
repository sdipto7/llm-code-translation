import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class s893778513 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");
        List<Integer> l = new ArrayList<>();
        for (String num : input) {
            l.add(Integer.parseInt(num));
        }
        int b = Integer.MIN_VALUE;
        for (int num : l) {
            if (num > b) {
                b = num;
            }
        }
        int s = 0;
        for (int num : l) {
            s += num;
        }
        if (b < s - b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
