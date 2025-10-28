import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class s240532461 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        
        ArrayList<Integer> aji = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            aji.add(L + i - 1);
        }
        
        if (Collections.min(aji) >= 0) {
            int minIndex = aji.indexOf(Collections.min(aji));
            aji.remove(minIndex);
        } else if (Collections.max(aji) <= 0) {
            int maxIndex = aji.indexOf(Collections.max(aji));
            aji.remove(maxIndex);
        } else {
            int minAbsIndex = 0;
            int minAbsValue = Math.abs(aji.get(0));
            for (int j = 1; j < aji.size(); j++) {
                if (Math.abs(aji.get(j)) < minAbsValue) {
                    minAbsValue = Math.abs(aji.get(j));
                    minAbsIndex = j;
                }
            }
            aji.remove(minAbsIndex);
        }
        
        int sum = 0;
        for (int num : aji) {
            sum += num;
        }
        System.out.println(sum);
    }
}
