
import java.util.*;

public class atcoder_ABC123_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstLine = sc.nextLine().split(" ");
        int x = Integer.parseInt(firstLine[0]);
        int y = Integer.parseInt(firstLine[1]);
        int z = Integer.parseInt(firstLine[2]);
        int k = Integer.parseInt(firstLine[3]);
        
        int[] a = new int[x];
        String[] aParts = sc.nextLine().split(" ");
        for (int i = 0; i < x; i++) {
            a[i] = Integer.parseInt(aParts[i]);
        }
        
        int[] b = new int[y];
        String[] bParts = sc.nextLine().split(" ");
        for (int i = 0; i < y; i++) {
            b[i] = Integer.parseInt(bParts[i]);
        }
        
        int[] c = new int[z];
        String[] cParts = sc.nextLine().split(" ");
        for (int i = 0; i < z; i++) {
            c[i] = Integer.parseInt(cParts[i]);
        }
        
        List<Long> ab = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ab.add(a[i] + (long)b[j]);
            }
        }
        ab.sort(Collections.reverseOrder());
        
        int limitAb = Math.min(k, x * y);
        List<Long> abTop = ab.subList(0, limitAb);
        
        List<Long> abc = new ArrayList<>();
        for (long num : abTop) {
            for (int j = 0; j < z; j++) {
                abc.add(num + c[j]);
            }
        }
        abc.sort(Collections.reverseOrder());
        
        for (int i = 0; i < k; i++) {
            System.out.println(abc.get(i));
        }
    }
}

