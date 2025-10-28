
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
            lst.add(new String(chars));
        }
        Collections.sort(lst);
        lst.add("end");
        String pre = "";
        int tmpCnt = 0;
        int cnt = 0;
        for (String i : lst) {
            if (i.equals(pre)) {
                tmpCnt++;
            } else {
                cnt += (tmpCnt * (tmpCnt + 1)) / 2;
                tmpCnt = 0;
                pre = i;
            }
        }
        System.out.println(cnt);
    }
}

