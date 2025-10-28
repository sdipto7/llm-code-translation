
import java.util.Arrays;
import java.util.Scanner;

public class s441329208 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = Arrays.toString(scanner.next().toCharArray());
        char[] sArray = s.substring(1, s.length() - 1).replaceAll(", ", "").toCharArray();
        Arrays.sort(sArray);
        String sortedS = new String(sArray);

        String t = Arrays.toString(scanner.next().toCharArray());
        char[] tArray = t.substring(1, t.length() - 1).replaceAll(", ", "").toCharArray();
        Arrays.sort(tArray);
        StringBuilder sb = new StringBuilder(new String(tArray));
        String sortedT = sb.reverse().toString();

        System.out.println(sortedS.compareTo(sortedT) < 0 ? "Yes" : "No");
        scanner.close();
    }
}

