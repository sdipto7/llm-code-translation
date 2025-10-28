
import java.util.*;

public class codeforces_274_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int num = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        input = scanner.nextLine().split(" ");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Set<Integer> different = new HashSet<>();
        int temp = 0;
        Arrays.sort(arr);
        for (int x : arr) {
            if (x % k != 0 || !different.contains(x / k)) {
                different.add(x);
            }
            temp = Math.max(different.size(), temp);
        }
        System.out.println(temp);
    }
}

