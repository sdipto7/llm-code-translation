import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class s087080706 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] firstLine = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);
        int x = Integer.parseInt(firstLine[2]);
        
        String[] secondLine = scanner.nextLine().split(" ");
        List<Integer> a = new ArrayList<>();
        for (String num : secondLine) {
            a.add(Integer.parseInt(num));
        }
        
        int ans = 0;
        
        int i = bisect(a, x);
        int leftCount = i;
        int rightCount = a.size() - i;
        System.out.println(Math.min(leftCount, rightCount));
    }
    
    private static int bisect(List<Integer> list, int value) {
        int low = 0;
        int high = list.size();
        
        while (low < high) {
            int mid = (low + high) / 2;
            if (list.get(mid) <= value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
