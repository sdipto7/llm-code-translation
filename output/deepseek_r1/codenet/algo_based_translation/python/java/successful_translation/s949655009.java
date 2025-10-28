
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class s949655009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strn = scanner.nextLine();
        int n = Integer.parseInt(strn);
        List<String> shichigolist = Arrays.asList("3", "5", "7");
        int length = strn.length();
        List<List<String>> shichigo = new ArrayList<>();
        
        for (int i = 0; i < length; i++) {
            shichigo.add(new ArrayList<>());
        }
        
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                shichigo.get(i).addAll(shichigolist);
            } else {
                for (String j : shichigo.get(i - 1)) {
                    for (String k : shichigolist) {
                        shichigo.get(i).add(j + k);
                    }
                }
            }
        }
        
        int target = length - 1;
        
        for (int i = 0; i < length; i++) {
            List<String> currentList = shichigo.get(i);
            List<String> copy = new ArrayList<>(currentList);
            for (String j : copy) {
                boolean shouldRemove = false;
                if (i == target) {
                    int num = Integer.parseInt(j);
                    if (num > n || !j.contains("3") || !j.contains("5") || !j.contains("7")) {
                        shouldRemove = true;
                    }
                } else {
                    if (!j.contains("3") || !j.contains("5") || !j.contains("7")) {
                        shouldRemove = true;
                    }
                }
                if (shouldRemove) {
                    currentList.remove(j);
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

