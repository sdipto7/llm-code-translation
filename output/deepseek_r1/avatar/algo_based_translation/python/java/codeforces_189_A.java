
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_189_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int length = Integer.parseInt(inputs[0]);
        int[] segments = new int[3];
        segments[0] = Integer.parseInt(inputs[1]);
        segments[1] = Integer.parseInt(inputs[2]);
        segments[2] = Integer.parseInt(inputs[3]);
        Arrays.sort(segments);
        
        if (length % segments[0] == 0) {
            System.out.println(length / segments[0]);
            return;
        }
        
        int ans = 0;
        
        if (segments[0] == segments[1]) {
            int maxI = length / segments[2];
            for (int i = 0; i <= maxI; i++) {
                int check = length - i * segments[2];
                if (check >= 0 && check % segments[0] == 0) {
                    ans = Math.max(ans, i + (check / segments[0]));
                }
            }
        } else {
            int maxI = length / segments[2];
            for (int i = 0; i <= maxI; i++) {
                int remainingAfterI = length - i * segments[2];
                int maxJ = remainingAfterI / segments[1];
                for (int j = 0; j <= maxJ; j++) {
                    int check = remainingAfterI - j * segments[1];
                    if (check >= 0 && check % segments[0] == 0) {
                        ans = Math.max(ans, i + j + (check / segments[0]));
                    }
                }
            }
        }
        
        System.out.println(ans);
    }
}

