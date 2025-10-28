
import java.util.Scanner;
import java.util.Arrays;

public class s441329208 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String t = scanner.nextLine().trim();
        
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        StringBuilder tReversed = new StringBuilder(new String(tArray)).reverse();
        
        String sortedS = new String(sArray);
        String sortedT = tReversed.toString();
        
        if (sortedS.compareTo(sortedT) < 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

