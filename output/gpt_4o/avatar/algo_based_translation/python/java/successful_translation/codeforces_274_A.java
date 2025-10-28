
import java.util.*;

public class codeforces_274_A {

    public static int calculateMaxDifferent(int num, int k, List<Integer> arr) {
        Set<Integer> different = new HashSet<>();
        int temp = 0;
        
        Collections.sort(arr);
        
        for (int x : arr) {
            if (x % k != 0 || !different.contains(x / k)) {
                different.add(x);
            }
            temp = Math.max(different.size(), temp);
        }
        
        return temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < num; i++) {
            arr.add(scanner.nextInt());
        }
        
        int result = calculateMaxDifferent(num, k, arr);
        System.out.println(result);
        
        scanner.close();
    }
}

