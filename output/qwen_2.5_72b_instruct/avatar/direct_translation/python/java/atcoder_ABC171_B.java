import java.util.*;

public class atcoder_ABC171_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        Collections.sort(numbers);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }
}
