
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
                for (String j : shichigo.get(i - 1)) {
                    for (String k : shichigolist) {
                        shichigo.get(i).add(j + k);
                    }
                }
            }
        }

        int target = strn.length() - 1;

        for (int i = 0; i < strn.length(); i++) {
            List<String> currentList = new ArrayList<>(shichigo.get(i));
            for (String j : currentList) {
                if (i == target) {
                    if (Integer.parseInt(j) > n || !(j.contains("3") && j.contains("5") && j.contains("7"))) {
                        shichigo.get(target).remove(j);
                    }
                } else {
                    if (!(j.contains("3") && j.contains("5") && j.contains("7"))) {
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
        scanner.close();
    }
}

