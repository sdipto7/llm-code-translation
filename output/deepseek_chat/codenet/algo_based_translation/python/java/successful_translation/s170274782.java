
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class s170274782 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (input[0].isEmpty()) {
                input = scanner.nextLine().split(" ");
            }
            ArrayList<Integer> s = new ArrayList<>();
            for (String num : input) {
                s.add(Integer.parseInt(num));
            }
            A.add(s);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> baselis = A.get(0);
            ArrayList<Integer> groundlis = A.get(1);
            count = 0;
            for (int j = 0; j <= i; j++) {
                count += baselis.get(j);
            }
            for (int j = i; j < N; j++) {
                count += groundlis.get(j);
            }
            ans.add(count);
        }
        System.out.println(Collections.max(ans));
    }
}

