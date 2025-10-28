
import java.util.Scanner;

public class s760938927 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int ka = scanner.nextInt();
        scanner.nextLine();
        
        char[][] mat = new char[h][w];
        for (int i = 0; i < h; i++) {
            String line = scanner.nextLine();
            mat[i] = line.toCharArray();
        }
        
        int ans = 0;
        int totalBits = h + w;
        int maxIterations = (int)Math.pow(2, totalBits);
        
        for (int i = 0; i < maxIterations; i++) {
            String binary = Integer.toBinaryString(i);
            String paddedBinary = String.format("%" + totalBits + "s", binary).replace(' ', '0');
            
            String rs = paddedBinary.substring(0, h);
            String cs = paddedBinary.substring(h);
            
            int ct = 0;
            for (int l = 0; l < h; l++) {
                for (int k = 0; k < w; k++) {
                    if (mat[l][k] == '#' && rs.charAt(l) == '0' && cs.charAt(k) == '0') {
                        ct++;
                    }
                }
            }
            
            if (ct == ka) {
                ans++;
            }
        }
        
        System.out.println(ans);
        scanner.close();
    }
}

