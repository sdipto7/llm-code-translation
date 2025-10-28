
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s949655009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strn = scanner.nextLine();
        int n = Integer.parseInt(strn);
        List<String> shichigolist = List.of("3", "5", "7");
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
                for (String j : new ArrayList<>(shichigo.get(i - 1))) {
                    for (String k : shichigolist) {
                        shichigo.get(i).add(j + k);
                    }
                }
            }
        }
        int target = strn.length() - 1;
        for (int i = 0; i < strn.length(); i++) {
            for (String j : new ArrayList<>(shichigo.get(i))) {
                if (i == target) {
                    if (Integer.parseInt(j) > n) {
                        shichigo.get(target).remove(j);
                    } else if (j.chars().filter(ch -> ch == '3').count() == 0 || 
                               j.chars().filter(ch -> ch == '5').count() == 0 || 
                               j.chars().filter(ch -> ch == '7').count() == 0) {
                        shichigo.get(target).remove(j);
                    }
                } else {
                    if (j.chars().filter(ch -> ch == '3').count() == 0 || 
                       j.chars().filter(ch -> ch == '5').count() == 0 || 
                       j.chars().filter(ch -> ch == '7').count() == 0) {
                        shichigo.get(i).remove(j);
                    }
                }
            }
        }
        int result = 0;
        for (List<String> sublist : shichigo) {
            result += sublist.size();
        }
        System.out.println(result);
    }
}

