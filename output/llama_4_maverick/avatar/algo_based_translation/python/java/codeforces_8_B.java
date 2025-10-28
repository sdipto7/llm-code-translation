
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String recordOfMovements = scanner.next();
        int x = 0, y = 0;
        Map<String, int[]> dMovement = new HashMap<>();
        dMovement.put("L", new int[]{0, -1});
        dMovement.put("R", new int[]{0, 1});
        dMovement.put("U", new int[]{1, 0});
        dMovement.put("D", new int[]{-1, 0});
        Map<String, String> d = new HashMap<>();
        d.put("0,0", "");
        boolean bug = false;
        for (char move : recordOfMovements.toCharArray()) {
            String temp = x + "," + y;
            x += dMovement.get(String.valueOf(move))[0];
            y += dMovement.get(String.valueOf(move))[1];
            String current = x + "," + y;
            if (!d.containsKey(current)) {
                for (Map.Entry<String, int[]> entry : dMovement.entrySet()) {
                    int newX = x + entry.getValue()[0];
                    int newY = y + entry.getValue()[1];
                    String neighbor = newX + "," + newY;
                    if (!neighbor.equals(temp) && d.containsKey(neighbor)) {
                        bug = true;
                        break;
                    }
                }
            } else {
                bug = true;
            }
            if (bug) {
                break;
            }
            d.put(current, "");
        }
        System.out.println(bug ? "BUG" : "OK");
    }
}

