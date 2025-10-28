
import java.util.*;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        resolve();
    }
    
    public static void resolve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> low = new ArrayList<>();
        List<Integer> high = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            low.add(a);
            high.add(b);
        }
        
        Collections.sort(low);
        Collections.sort(high);
        
        if (n % 2 == 1) {
            int medianIndex = (n + 1) / 2 - 1;
            int result = high.get(medianIndex) - low.get(medianIndex) + 1;
            System.out.println(result);
        } else {
            double hh = (high.get(n / 2 - 1) + high.get(n / 2)) / 2.0;
            double ll = (low.get(n / 2 - 1) + low.get(n / 2)) / 2.0;
            int result = (int)((hh - ll) * 2) + 1;
            System.out.println(result);
        }
    }
}

