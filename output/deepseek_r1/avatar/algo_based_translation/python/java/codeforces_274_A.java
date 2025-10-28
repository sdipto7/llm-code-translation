
import java.util.*;

public class codeforces_274_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split("\\s+");
        int num = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);
        String[] arrLine = scanner.nextLine().split("\\s+");
        int[] arr = new int[arrLine.length];
        
        for (int i = 0; i < arrLine.length; i++) {
            arr[i] = Integer.parseInt(arrLine[i]);
        }
        
        Arrays.sort(arr);
        Set<Integer> different = new HashSet<>();
        int temp = 0;
        
        for (int x : arr) {
            if (x % k != 0 || !different.contains(x / k)) {
                different.add(x);
            }
            temp = Math.max(temp, different.size());
        }
        
        System.out.println(temp);
    }
}

