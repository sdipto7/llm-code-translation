import java.util.ArrayList;
import java.util.List;

public class s949655009 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String strn = scanner.nextLine();
        int n = Integer.parseInt(strn);
        List<String> shichigolist = List.of("3", "5", "7");
        List<List<String>> shichigo = new ArrayList<>();
        for (int i = 0; i < strn.length(); i++) {
            shichigo.add(new ArrayList<>());
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
            List<String> toRemove = new ArrayList<>();
            for (String j : shichigo.get(i)) {
                if (i == target) {
                    if (Integer.parseInt(j) > n) {
                        toRemove.add(j);
                    } else if (j.chars().filter(ch -> ch == '3').count() == 0 || j.chars().filter(ch -> ch == '5').count() == 0 || j.chars().filter(ch -> ch == '7').count() == 0) {
                        toRemove.add(j);
                    }
                } else {
                    if (j.chars().filter(ch -> ch == '3').count() == 0 || j.chars().filter(ch -> ch == '5').count() == 0 || j.chars().filter(ch -> ch == '7').count() == 0) {
                        toRemove.add(j);
                    }
                }
            }
            shichigo.get(i).removeAll(toRemove);
        }
        int sum = 0;
        for (int i = 0; i < strn.length(); i++) {
            sum += shichigo.get(i).size();
        }
        System.out.println(sum);
    }
}
