
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
        if (aji.get(0) >= 0) {
            aji.remove(0);
        } else if (aji.get(aji.size() - 1) <= 0) {
            aji.remove(aji.size() - 1);
        } else {
            int minAbs = Integer.MAX_VALUE;
            int indexToRemove = -1;
            for (int i = 0; i < aji.size(); i++) {
                int current = aji.get(i);
                int abs = Math.abs(current);
                if (abs < minAbs) {
                    minAbs = abs;
                    indexToRemove = i;
                }
            }
            aji.remove(indexToRemove);
        }
        int sum = 0;
        for (int num : aji) {
            sum += num;
        }
        System.out.println(sum);
    }
}

