
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String recordOfMovements = scanner.next();
        int x = 0, y = 0;
        Map<String, String> d = new HashMap<>();
        d.put("0,0", "");
        boolean bug = false;
        Map<Character, int[]> dMovement = new HashMap<>();
        dMovement.put('L', new int[]{0, -1});
        dMovement.put('R', new int[]{0, 1});
        dMovement.put('U', new int[]{1, 0});
        dMovement.put('D', new int[]{-1, 0});
        for (char move : recordOfMovements.toCharArray()) {
            int[] movement = dMovement.get(move);
            int tempX = x, tempY = y;
            x += movement[0];
            y += movement[1];
            if (!d.containsKey(x + "," + y)) {
                for (Map.Entry<Character, int[]> entry : dMovement.entrySet()) {
                    int newX = x + entry.getValue()[0];
                    int newY = y + entry.getValue()[1];
                    if (newX != tempX || newY != tempY) {
                        if (d.containsKey(newX + "," + newY)) {
                            bug = true;
                            break;
                        }
                    }
                }
            } else {
                bug = true;
            }
            if (bug) {
                break;
            }
            d.put(x + "," + y, "");
        }
        System.out.println(bug ? "BUG" : "OK");
    }
}

