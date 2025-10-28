
import java.util.*;

public class s913338871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        String[] inputNumbers = scanner.nextLine().split(" ");
        List<Integer> a = new ArrayList<>();

        for (String num : inputNumbers) {
            a.add(Integer.parseInt(num));
        }

        Collections.sort(a);

        int sum = 0;
        for (int i = N; i < a.size(); i += 2) {
            sum += a.get(i);
        }

        System.out.println(sum);

        scanner.close();
    }
}

