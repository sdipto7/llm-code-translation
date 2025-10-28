import java.util.*;
public class s430322735 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String st = scanner.next();
            char[] chars = st.toCharArray();
            Arrays.sort(chars);
            lst.add(new String(chars));
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
                for (int j = 1; j <= tmp_cnt; j++) {
                    cnt += j;
                }
                tmp_cnt = 0;
            }
            pre = i;
        }
        System.out.println(cnt);
    }
}
