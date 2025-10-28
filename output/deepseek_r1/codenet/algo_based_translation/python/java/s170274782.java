
import java.util.*;

public class s170274782 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        
        List<Integer> baselis = new ArrayList<>();
        List<Integer> groundlis = new ArrayList<>();
        
        for (int i = 0; i < 2; i++) {
            String[] parts = scanner.nextLine().split(" ");
            for (String part : parts) {
                if (i == 0) {
                    baselis.add(Integer.parseInt(part));
                } else {
                    groundlis.add(Integer.parseInt(part));
                }
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += baselis.get(j);
            }
            for (int j = i; j < N; j++) {
                sum += groundlis.get(j);
            }
            ans.add(sum);
        }
        
        System.out.println(Collections.max(ans));
    }
}

