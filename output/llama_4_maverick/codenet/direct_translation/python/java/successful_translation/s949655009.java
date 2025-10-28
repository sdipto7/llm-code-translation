
import java.util.*;

public class s949655009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strn = scanner.next();
        int n = Integer.parseInt(strn);
        String[] shichigolist = {"3", "5", "7"};
        List<List<String>> shichigo = new ArrayList<>();
        for (int i = 0; i < strn.length(); i++) {
            shichigo.add(new ArrayList<>());
        }
        for (int i = 0; i < strn.length(); i++) {
            if (i == 0) {
                for (String j : shichigolist) {
                    shichigo.get(i).add(j);
                }
            } else {
                for (String j : shichigo.get(i - 1)) {
                    for (String k : shichigolist) {
                        shichigo.get(i).add(j + k);
                    }
                }
            }
        }
        int target = strn.length() - 1;
        for (int i = 0; i < strn.length(); i++) {
            Iterator<String> iterator = shichigo.get(i).iterator();
            while (iterator.hasNext()) {
                String j = iterator.next();
                if (i == target) {
                    if (Long.parseLong(j) > n || !isValid(j)) {
                        iterator.remove();
                    }
                } else {
                    if (!isValid(j)) {
                        iterator.remove();
                    }
                }
            }
        }
        int sum = 0;
        for (List<String> list : shichigo) {
            sum += list.size();
        }
        System.out.println(sum);
    }

    public static boolean isValid(String s) {
        return s.contains("3") && s.contains("5") && s.contains("7");
    }
}

