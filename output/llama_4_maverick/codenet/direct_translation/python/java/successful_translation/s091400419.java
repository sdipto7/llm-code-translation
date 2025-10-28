
import java.util.Scanner;
public class s091400419 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        int[] lst = {a+b, a-b, a*b};
        int max = lst[0];
        for (int i = 1; i < lst.length; i++) {
            if (lst[i] > max) {
                max = lst[i];
            }
        }
        System.out.println(max);
    }
}

