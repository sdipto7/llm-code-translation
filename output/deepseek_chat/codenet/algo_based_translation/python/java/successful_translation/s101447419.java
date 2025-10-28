
import java.util.*;
import java.util.stream.Collectors;

public class s101447419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> v = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            v.add(scanner.nextInt());
        }
        
        List<Integer> ve = new ArrayList<>();
        List<Integer> vo = new ArrayList<>();
        for (int i = 0; i < n / 2; i++) {
            ve.add(v.get(2 * i));
            vo.add(v.get(2 * i + 1));
        }
        
        Map<Integer, Long> ce = ve.stream()
            .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        Map<Integer, Long> co = vo.stream()
            .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        
        List<Map.Entry<Integer, Long>> ceSorted = ce.entrySet().stream()
            .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
            .collect(Collectors.toList());
        List<Map.Entry<Integer, Long>> coSorted = co.entrySet().stream()
            .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
            .collect(Collectors.toList());
        
        int ans = n;
        
        if (!ceSorted.isEmpty() && !coSorted.isEmpty() && 
            !ceSorted.get(0).getKey().equals(coSorted.get(0).getKey())) {
            ans = n - ceSorted.get(0).getValue().intValue() - coSorted.get(0).getValue().intValue();
        } else if (ce.size() == 1 && co.size() == 1) {
            ans = n - ceSorted.get(0).getValue().intValue();
        } else if (ce.size() == 1) {
            ans = n - ceSorted.get(0).getValue().intValue() - coSorted.get(1).getValue().intValue();
        } else if (co.size() == 1) {
            ans = n - ceSorted.get(1).getValue().intValue() - coSorted.get(0).getValue().intValue();
        } else {
            int option1 = n - ceSorted.get(0).getValue().intValue() - coSorted.get(1).getValue().intValue();
            int option2 = n - ceSorted.get(1).getValue().intValue() - coSorted.get(0).getValue().intValue();
            ans = Math.min(option1, option2);
        }
        
        System.out.println(ans);
        scanner.close();
    }
}

