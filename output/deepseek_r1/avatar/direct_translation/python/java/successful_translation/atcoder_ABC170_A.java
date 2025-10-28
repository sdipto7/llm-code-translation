import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String part : parts) {
            list.add(Integer.parseInt(part));
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
