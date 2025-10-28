
import java.util.*;

public class s735480710 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] a = scanner.nextLine().split(" ");
        
        List<String> evenIndices = new ArrayList<>();
        for (int i = 0; i < a.length; i += 2) {
            evenIndices.add(a[i]);
        }
        
        List<String> oddIndices = new ArrayList<>();
        for (int i = 1; i < a.length; i += 2) {
            oddIndices.add(a[i]);
        }
        
        Collections.reverse(oddIndices);
        List<String> b = new ArrayList<>(oddIndices);
        b.addAll(evenIndices);
        
        if (a.length % 2 == 0) {
            System.out.println(String.join(" ", b));
        } else {
            Collections.reverse(b);
            System.out.println(String.join(" ", b));
        }
    }
}

