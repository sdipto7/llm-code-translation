import java.util.Scanner;
import java.util.ArrayList;

public class s170274782 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        for (int _ = 0; _ < 2; _++) {
            ArrayList<Integer> s = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                s.add(scanner.nextInt());
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

        int max = 0;
        for (int num : ans) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
