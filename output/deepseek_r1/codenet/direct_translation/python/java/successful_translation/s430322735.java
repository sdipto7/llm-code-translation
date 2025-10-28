
import java.util.*;

public class s430322735 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            list.add(new String(chars));
        }
        Collections.sort(list);
        list.add("end");
        String prev = "";
        int currentCount = 0;
        int total = 0;
        for (String s : list) {
            if (s.equals(prev)) {
                currentCount++;
            } else {
                total += (currentCount * (currentCount + 1)) / 2;
                currentCount = 0;
            }
            prev = s;
        }
        System.out.println(total);
    }
}

