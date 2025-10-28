
import java.util.*;

public class s441329208 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().replaceAll("\\s+$", "");
        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);
        
        String t = scanner.nextLine().replaceAll("\\s+$", "");
        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);
        for (int i = 0; i < tChars.length / 2; i++) {
            char temp = tChars[i];
            tChars[i] = tChars[tChars.length - 1 - i];
            tChars[tChars.length - 1 - i] = temp;
        }
        
        System.out.println(new String(sChars).compareTo(new String(tChars)) < 0 ? "Yes" : "No");
    }
}

