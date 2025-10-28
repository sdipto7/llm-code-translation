
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class s430322735 {

    public static void main(String[] args) {
        System.out.println(countAnagramPairs());
    }

    public static int countAnagramPairs() {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        List<String> lst = new ArrayList<>();
        int pair = 0; // Not used further in the code
        
        for (int i = 0; i < n; i++) {
            char[] chars = scanner.nextLine().toCharArray();
            java.util.Arrays.sort(chars);
            String st = new String(chars);
            lst.add(st);
        }
        
        Collections.sort(lst);
        lst.add("end");
        
        String pre = "";
        int tmp_cnt = 0;
        int cnt = 0;
        
        for (String i : lst) {
            if (i.equals(pre)) {
                tmp_cnt += 1;
            } else {
                cnt += (tmp_cnt * (tmp_cnt + 1)) / 2;
                tmp_cnt = 0;
            }
            pre = i;
        }
        
        scanner.close();
        return cnt;
    }
}

