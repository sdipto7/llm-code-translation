import java.util.HashMap;
import java.util.Map;

public class codeforces_8_B {
    public static void main(String[] args) {
        String record_of_movements = new java.util.Scanner(System.in).nextLine();
        int x = 0, y = 0;
        Map<String, int[]> d_movement = new HashMap<>();
        d_movement.put("L", new int[]{0, -1});
        d_movement.put("R", new int[]{0, 1});
        d_movement.put("U", new int[]{1, 0});
        d_movement.put("D", new int[]{-1, 0});
        Map<String, String> d = new HashMap<>();
        d.put(x + "," + y, "");
        boolean bug = false;
        for (char move : record_of_movements.toCharArray()) {
            String temp = x + "," + y;
            x += d_movement.get(String.valueOf(move))[0];
            y += d_movement.get(String.valueOf(move))[1];
            if (!d.containsKey(x + "," + y)) {
                for (String step : d_movement.keySet()) {
                    if (!(x + d_movement.get(step)[0] == Integer.parseInt(temp.split(",")[0]) && y + d_movement.get(step)[1] == Integer.parseInt(temp.split(",")[1])) && d.containsKey((x + d_movement.get(step)[0]) + "," + (y + d_movement.get(step)[1]))) {
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
            d.put(x + "," + y, "");
        }
        if (bug) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}
