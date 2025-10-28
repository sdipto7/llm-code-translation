
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class s240532461 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        ArrayList<Integer> aji = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            aji.add(L + i - 1);
        }
        int min = Collections.min(aji);
        int max = Collections.max(aji);
        if (min >= 0) {
            aji.remove(Integer.valueOf(min));
        } else if (max <= 0) {
            aji.remove(Integer.valueOf(max));
        } else {
            int candidate = aji.get(0);
            int minAbs = Math.abs(candidate);
            for (int num : aji) {
                int currentAbs = Math.abs(num);
                if (currentAbs < minAbs) {
                    candidate = num;
                    minAbs = currentAbs;
                }
            }
            aji.remove(Integer.valueOf(candidate));
        }
        int sum = 0;
        for (int num : aji) {
            sum += num;
        }
        System.out.println(sum);
    }
}

