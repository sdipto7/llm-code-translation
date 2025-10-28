
import java.util.*;

public class s683277023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        String[] nums = scanner.nextLine().split(" ");
        ArrayList<Integer> li = new ArrayList<>();
        for (String num : nums) {
            li.add(Integer.parseInt(num));
        }
        Collections.sort(li);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += li.get(i);
        }
        System.out.println(sum);
    }
}

