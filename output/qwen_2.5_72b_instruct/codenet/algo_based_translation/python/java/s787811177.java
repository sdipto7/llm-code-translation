import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class s787811177 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> ls = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            List<Integer> sublist = new ArrayList<>();
            sublist.add(scanner.nextInt());
            sublist.add(scanner.nextInt());
            ls.add(sublist);
        }
        
        Collections.sort(ls, new Comparator<List<Integer>>() {
            public int compare(List<Integer> o1, List<Integer> o2) {
                return (o2.get(0) + o2.get(1)) - (o1.get(0) + o1.get(1));
            }
        });
        
        int taka = 0;
        for (int i = 0; i < ls.size(); i += 2) {
            taka += ls.get(i).get(0);
        }
        
        int aoki = 0;
        for (int i = 1; i < ls.size(); i += 2) {
            aoki += ls.get(i).get(1);
        }
        
        System.out.println(taka - aoki);
    }
}
