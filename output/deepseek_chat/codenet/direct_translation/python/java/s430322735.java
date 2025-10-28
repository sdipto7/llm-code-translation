
import java.util.*;

public class s430322735 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] arr = sc.next().toCharArray();
            Arrays.sort(arr);
            lst.add(new String(arr));
        }
        Collections.sort(lst);
        lst.add("end");
        String pre = "";
        int tmpCnt = 0;
        int cnt = 0;
        for (String s : lst) {
            if (s.equals(pre)) {
                tmpCnt++;
            } else {
                cnt += (tmpCnt * (tmpCnt + 1)) / 2;
                tmpCnt = 0;
            }
            pre = s;
        }
        System.out.println(cnt);
    }
}

