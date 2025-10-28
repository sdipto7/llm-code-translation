
import java.util.*;

public class s949655009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strn = scanner.nextLine();
        long n = Long.parseLong(strn);
        List<String> shichigolist = Arrays.asList("3", "5", "7");
        int len = strn.length();
        List<List<String>> shichigo = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            shichigo.add(new ArrayList<>());
        }
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                shichigo.get(i).addAll(shichigolist);
            } else {
                List<String> prevList = shichigo.get(i - 1);
                for (String j : prevList) {
                    for (String k : shichigolist) {
                        shichigo.get(i).add(j + k);
                    }
                }
            }
        }
        int target = len - 1;
        for (int i = 0; i < len; i++) {
            List<String> currentList = shichigo.get(i);
            List<String> filtered = new ArrayList<>();
            for (String s : currentList) {
                boolean has3 = s.contains("3");
                boolean has5 = s.contains("5");
                boolean has7 = s.contains("7");
                if (!has3 || !has5 || !has7) {
                    continue;
                }
                if (i == target) {
                    long num = Long.parseLong(s);
                    if (num > n) {
                        continue;
                    }
                }
                filtered.add(s);
            }
            shichigo.set(i, filtered);
        }
        int total = 0;
        for (List<String> list : shichigo) {
            total += list.size();
        }
        System.out.println(total);
    }
}

