
import java.util.*;

public class s101447419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }
        scanner.close();

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
        ceList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        coList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int ans = n;
        if (ceList.size() > 0 && coList.size() > 0 && !ceList.get(0).getKey().equals(coList.get(0).getKey())) {
            ans = n - ceList.get(0).getValue() - coList.get(0).getValue();
        } else if (ceList.size() == 1 && coList.size() == 1) {
            ans = n - ceList.get(0).getValue();
        } else if (ceList.size() == 1) {
            if (coList.size() > 1) {
                ans = n - ceList.get(0).getValue() - coList.get(1).getValue();
            } else {
                ans = n - ceList.get(0).getValue();
            }
        } else if (coList.size() == 1) {
            if (ceList.size() > 1) {
                ans = n - ceList.get(1).getValue() - coList.get(0).getValue();
            } else {
                ans = n - coList.get(0).getValue();
            }
        } else {
            ans = Math.min(n - ceList.get(0).getValue() - coList.get(1).getValue(), n - ceList.get(1).getValue() - coList.get(0).getValue());
        }
        System.out.println(ans);
    }
}

