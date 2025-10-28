
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class s828550015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextLine();
        
        ArrayList<Integer> p = processList(scanner, x, true);
        ArrayList<Integer> q = processList(scanner, y, true);
        ArrayList<Integer> r = processList(scanner, -1, true);
        
        ArrayList<Integer> pq = new ArrayList<>();
        pq.addAll(p);
        pq.addAll(q);
        Collections.sort(pq);
        
        int limit = Math.min(x + y, Math.min(a + b, c));
        for (int i = 0; i < limit; i++) {
            if (pq.get(i) < r.get(i)) {
                pq.set(i, r.get(i));
            }
        }
        
        long sum = 0;
        for (int num : pq) {
            sum += num;
        }
        System.out.println(sum);
    }
    
    private static ArrayList<Integer> processList(Scanner scanner, int take, boolean descending) {
        String[] parts = scanner.nextLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (String part : parts) {
            list.add(Integer.parseInt(part));
        }
        if (descending) {
            Collections.sort(list, Collections.reverseOrder());
        } else {
            Collections.sort(list);
        }
        if (take > 0) {
            int subSize = Math.min(take, list.size());
            return new ArrayList<>(list.subList(0, subSize));
        }
        return new ArrayList<>(list);
    }
}

