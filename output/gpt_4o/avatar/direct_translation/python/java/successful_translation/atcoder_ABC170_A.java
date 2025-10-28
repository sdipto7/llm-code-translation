
import java.util.*;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        while (scanner.hasNextInt()) {
            a.add(scanner.nextInt());
        }
        for (int e = 0; e < a.size(); e++) {
            if (a.get(e) == 0) {
                System.out.println(e + 1);
                break;
            }
        }
    }
}

