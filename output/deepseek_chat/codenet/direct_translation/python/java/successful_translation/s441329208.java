
import java.util.*;
import java.io.*;

public class s441329208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().trim().toCharArray();
        char[] t = br.readLine().trim().toCharArray();
        Arrays.sort(s);
        Arrays.sort(t);
        reverseArray(t);
        System.out.println(new String(s).compareTo(new String(t)) < 0 ? "Yes" : "No");
    }

    private static void reverseArray(char[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}

