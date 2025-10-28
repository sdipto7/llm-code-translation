import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class s430322735 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> lst = new ArrayList<>();
        int pair = 0;
        for (int i = 0; i < n; i++) {
            String st = scanner.next();
            char[] chars = st.toCharArray();
            java.util.Arrays.sort(chars);
            lst.add(new String(chars));
        }
        Collections.sort(lst);
        lst.add("end");
        String pre = "";
        int tmp_cnt = 0;
        int cnt = 0;
        for (String i : lst) {
            if (i.equals(pre)) {
                tmp_cnt++;
            } else {
                for (int j = 1; j <= tmp_cnt; j++) {
                    cnt += j;
                }
                tmp_cnt = 0;
                pre = i;
            }
        }
        System.out.println(cnt);
        scanner.close();
    }
}
