
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
            List<String> list = new ArrayList<>(shichigo.get(i));
            for (String j : list) {
                if (i == target) {
                    if (Integer.parseInt(j) > n) {
                        shichigo.get(i).remove(j);
                    } else if (countChar(j, '3') == 0 || countChar(j, '5') == 0 || countChar(j, '7') == 0) {
                        shichigo.get(i).remove(j);
                    }
                } else {
                    if (countChar(j, '3') == 0 || countChar(j, '5') == 0 || countChar(j, '7') == 0) {
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

    private static int countChar(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }
}

