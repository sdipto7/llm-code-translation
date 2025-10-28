
import java.util.*;

public class s768331281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        sc.nextLine();
        
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine().replaceAll("\\s+$", "");
            list.add(s);
        }
        
        Collections.sort(list);
        System.out.println(String.join("", list));
    }
}

