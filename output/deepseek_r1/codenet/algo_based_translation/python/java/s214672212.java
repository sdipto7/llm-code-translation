
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class s214672212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        List<Integer> nums = new ArrayList<>();
        for (String part : parts) {
            if (!part.isEmpty()) {
                nums.add(Integer.parseInt(part));
            }
        }
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println(nums.get(0) * 10 + nums.get(1) + nums.get(2));
    }
}

