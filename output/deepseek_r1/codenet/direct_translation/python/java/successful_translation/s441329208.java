
import java.util.*;

public class s441329208 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String t = scanner.nextLine().trim();
        
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        String sortedS = new String(sArr);
        
        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);
        reverse(tArr);
        String sortedT = new String(tArr);
        
        System.out.println(sortedS.compareTo(sortedT) < 0 ? "Yes" : "No");
    }
    
    private static void reverse(char[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

