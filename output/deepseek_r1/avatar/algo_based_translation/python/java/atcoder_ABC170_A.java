
import java.util.Scanner;
import java.util.ArrayList;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().trim().split("\\s+");
        ArrayList<Integer> a = new ArrayList<>();
        for (String part : parts) {
            a.add(Integer.parseInt(part));
        }
        for (int e = 0; e < a.size(); e++) {
            int i = a.get(e);
            if (i == 0) {
                System.out.println(e + 1);
                break;
            }
        }
    }
}

