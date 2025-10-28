
import java.util.*;

public class s735480710 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] a = scanner.nextLine().split(" ");
        List<String> b = new ArrayList<>();
        
        List<String> oddIndices = new ArrayList<>();
        List<String> evenIndices = new ArrayList<>();
        
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 1) {
                oddIndices.add(a[i]);
            } else {
                evenIndices.add(a[i]);
            }
        }
        
        Collections.reverse(oddIndices);
        b.addAll(oddIndices);
        b.addAll(evenIndices);
        
        if (a.length % 2 == 0) {
            System.out.println(String.join(" ", b));
        } else {
            Collections.reverse(b);
            System.out.println(String.join(" ", b));
        }
    }
}

