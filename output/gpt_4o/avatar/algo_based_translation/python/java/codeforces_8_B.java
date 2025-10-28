
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_8_B {

    public static String checkMovements(String recordOfMovements) {
        int x = 0;
        int y = 0;
        Map<Character, int[]> dMovement = new HashMap<>();
        dMovement.put('L', new int[]{0, -1});
        dMovement.put('R', new int[]{0, 1});
        dMovement.put('U', new int[]{1, 0});
        dMovement.put('D', new int[]{-1, 0});

        Map<String, String> d = new HashMap<>();
        d.put(x + "," + y, "");
        boolean bug = false;

        for (char move : recordOfMovements.toCharArray()) {
            int[] temp = new int[]{x, y};
            x += dMovement.get(move)[0];
            y += dMovement.get(move)[1];

            String currentPosition = x + "," + y;
            if (!d.containsKey(currentPosition)) {
                for (char step : dMovement.keySet()) {
                    int newX = x + dMovement.get(step)[0];
                    int newY = y + dMovement.get(step)[1];
                    String neighborPosition = newX + "," + newY;
                    if (!(newX == temp[0] && newY == temp[1]) && d.containsKey(neighborPosition)) {
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
            d.put(currentPosition, "");
        }

        return bug ? "BUG" : "OK";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String recordOfMovements = scanner.nextLine();
        System.out.println(checkMovements(recordOfMovements));
        scanner.close();
    }
}

