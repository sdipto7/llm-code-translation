import java.util.*;

public class s101447419 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        List<Integer> ve = new ArrayList<>();
        List<Integer> vo = new ArrayList<>();
        for (int i = 0; i < n / 2; i++) {
            ve.add(v[2 * i]);
            vo.add(v[2 * i + 1]);
        }
        Map<Integer, Integer> ce = new HashMap<>();
        Map<Integer, Integer> co = new HashMap<>();
        for (int num : ve) {
            ce.put(num, ce.getOrDefault(num, 0) + 1);
        }
        for (int num : vo) {
            co.put(num, co.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> ceList = new ArrayList<>(ce.entrySet());
        List<Map.Entry<Integer, Integer>> coList = new ArrayList<>(co.entrySet());
        ceList.sort((a, b) -> b.getValue() - a.getValue());
        coList.sort((a, b) -> b.getValue() - a.getValue());
        int ans = n;
        if (ceList.get(0).getKey() != coList.get(0).getKey()) {
            ans = n - ceList.get(0).getValue() - coList.get(0).getValue();
        } else if (ce.size() == 1 && co.size() == 1) {
            ans = n - ceList.get(0).getValue();
        } else if (ce.size() == 1) {
            ans = n - ceList.get(0).getValue() - coList.get(1).getValue();
        } else if (co.size() == 1) {
            ans = n - ceList.get(1).getValue() - coList.get(0).getValue();
        } else {
            ans = Math.min(n - ceList.get(0).getValue() - coList.get(1).getValue(), n - ceList.get(1).getValue() - coList.get(0).getValue());
        }
        System.out.println(ans);
    }
}
