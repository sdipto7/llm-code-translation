
import java.util.*;

public class s214672212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        for (String s : scanner.nextLine().split(" ")) {
            nums.add(Integer.parseInt(s));
        }
        nums.sort(Collections.reverseOrder());
        int result = nums.get(0) * 10 + nums.get(1) + nums.get(2);
        System.out.println(result);
    }
}

