
import java.util.Arrays;
import java.util.Scanner;

public class s441329208 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String t = scanner.nextLine().trim();
        
        String sorted_s = sortStringAscending(s);
        String sorted_t = sortStringDescending(t);
        
        if (sorted_s.compareTo(sorted_t) < 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    private static String sortStringAscending(String input) {
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
    
    private static String sortStringDescending(String input) {
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        reverseArray(charArray);
        return new String(charArray);
    }
    
    private static void reverseArray(char[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}

