import java.util.*;

public class s430322735 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        
        List<String> lst = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String st = scanner.nextLine();
            char[] chars = st.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            lst.add(sortedStr);
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
                int sum_val = 0;
                for (int j = 1; j <= tmp_cnt; j++) {
                    sum_val += j;
                }
                cnt += sum_val;
                tmp_cnt = 0;
            }
            pre = i;
        }
        
        System.out.println(cnt);
    }
}
