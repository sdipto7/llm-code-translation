
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s949655009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strn = scanner.nextLine();
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
            for (int j = shichigo.get(i).size() - 1; j >= 0; j--) {
                String num = shichigo.get(i).get(j);
                if (i == target) {
                    if (Integer.parseInt(num) > n || !num.contains("3") || !num.contains("5") || !num.contains("7")) {
                        shichigo.get(target).remove(j);
                    }
                } else {
                    if (!num.contains("3") || !num.contains("5") || !num.contains("7")) {
                        shichigo.get(i).remove(j);
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
}

