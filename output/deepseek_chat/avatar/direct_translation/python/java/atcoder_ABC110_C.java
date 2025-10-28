hto import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC110_C {
    public static String run(String s, String t) {
        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            sCount.put(c, sCount.getOrDefault(c, 0) + 1);
        }
        
        for (char c : t.toCharArray()) {
            tCount.put(c, tCount.getOrDefault(c, 0) + 1);
        }
        
        int[] sArray = new int[sCount.size()];
        int[] tArray = new int[tCount.size()];
        
        int index = 0;
        for (int value : sCount.values()) {
            sArray[index++] = value;
        }
        
        index = 0;
        for (int value : tCount.values()) {
            tArray[index++] = value;
        }
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        return Arrays.equals(sArray, tArray) ? "Yes" : "No";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(run(s, t));
    }
}
