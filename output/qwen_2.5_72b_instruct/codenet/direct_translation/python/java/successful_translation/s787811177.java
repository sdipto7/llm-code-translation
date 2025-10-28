import java.util.*;
public class s787811177 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<List<Integer>> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = Arrays.asList(in.nextInt(), in.nextInt());
            ls.add(row);
        }
        ls.sort((x, y) -> Integer.compare(y.stream().mapToInt(Integer::intValue).sum(), x.stream().mapToInt(Integer::intValue).sum()));
        int taka = 0;
        int aoki = 0;
        for (int i = 0; i < ls.size(); i++) {
            if (i % 2 == 0) {
                taka += ls.get(i).get(0);
            } else {
                aoki += ls.get(i).get(1);
            }
        }
        System.out.println(taka - aoki);
    }
}
