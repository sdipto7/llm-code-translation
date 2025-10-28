
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String record_of_movements = scanner.nextLine();
        int x = 0, y = 0;
        Map<Character, int[]> d_movement = new HashMap<>();
        d_movement.put('L', new int[]{0, -1});
        d_movement.put('R', new int[]{0, 1});
        d_movement.put('U', new int[]{1, 0});
        d_movement.put('D', new int[]{-1, 0});
        Map<String, String> d = new HashMap<>();
        d.put(x + "," + y, "");
        boolean bug = false;
        for (char move : record_of_movements.toCharArray()) {
            int tempX = x, tempY = y;
            x += d_movement.get(move)[0];
            y += d_movement.get(move)[1];
            String pos = x + "," + y;
            if (!d.containsKey(pos)) {
                for (char step : d_movement.keySet()) {
                    String neighbor = (x + d_movement.get(step)[0]) + "," + (y + d_movement.get(step)[1]);
                    if (!neighbor.equals(tempX + "," + tempY) && d.containsKey(neighbor)) {
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
            d.put(pos, "");
        }
        if (bug) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}

