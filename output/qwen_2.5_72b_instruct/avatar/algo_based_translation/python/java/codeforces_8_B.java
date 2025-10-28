
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String recordOfMovements = scanner.nextLine();
        int x = 0;
        int y = 0;
        Map<String, int[]> dMovement = new HashMap<>();
        dMovement.put("L", new int[]{0, -1});
        dMovement.put("R", new int[]{0, 1});
        dMovement.put("U", new int[]{1, 0});
        dMovement.put("D", new int[]{-1, 0});
        Map<Map.Entry<Integer, Integer>, String> d = new HashMap<>();
        d.put(Map.entry(x, y), "");
        boolean bug = false;

        for (char moveChar : recordOfMovements.toCharArray()) {
            String move = String.valueOf(moveChar);
            Map.Entry<Integer, Integer> temp = Map.entry(x, y);
            x += dMovement.get(move)[0];
            y += dMovement.get(move)[1];
            if (!d.containsKey(Map.entry(x, y))) {
                for (String step : dMovement.keySet()) {
                    int newX = x + dMovement.get(step)[0];
                    int newY = y + dMovement.get(step)[1];
                    if (!Map.entry(newX, newY).equals(temp) && d.containsKey(Map.entry(newX, newY))) {
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
            d.put(Map.entry(x, y), "");
        }

        if (bug) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}

