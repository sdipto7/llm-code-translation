
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s240532461 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        List<Integer> aji = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            aji.add(L + i - 1);
        }
        if (aji.stream().min(Integer::compareTo).get() >= 0) {
            aji.remove(aji.indexOf(aji.stream().min(Integer::compareTo).get()));
        } else if (aji.stream().max(Integer::compareTo).get() <= 0) {
            aji.remove(aji.indexOf(aji.stream().max(Integer::compareTo).get()));
        } else {
            aji.remove(aji.indexOf(aji.stream().min((a, b) -> Integer.compare(Math.abs(a), Math.abs(b))).get()));
        }
        int sum = aji.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}

