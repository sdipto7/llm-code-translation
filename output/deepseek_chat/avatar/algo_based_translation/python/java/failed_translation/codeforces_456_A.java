
import java.util.*;

public class codeforces_456_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<List<Integer>> m = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            List<Integer> row = new ArrayList<>();
            for (String part : parts) {
                row.add(Integer.parseInt(part));
            }
            m.add(row);
        }
        
        m.sort((list1, list2) -> list2.get(0).compareTo(list1.get(0)));
        
        List<Integer> a = m.get(0);
        boolean found = false;
        
        for (int i = 1; i < m.size(); i++) {
            List<Integer> current = m.get(i);
            if (current.get(1) > a.get(1)) {
                System.out.println("Happy Alex");
                found = true;
                break;
            }
            a = current;
        }
        
        if (!found) {
            System.out.println("Poor Alex");
        }
    }
}

