
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String recordOfMovements = scanner.nextLine();
        scanner.close();

        int x = 0, y = 0;
        HashMap<Character, int[]> movementMap = new HashMap<>();
        movementMap.put('L', new int[]{0, -1});
        movementMap.put('R', new int[]{0, 1});
        movementMap.put('U', new int[]{1, 0});
        movementMap.put('D', new int[]{-1, 0});

        Set<String> visited = new HashSet<>();
        visited.add(x + "," + y);
        boolean bug = false;

        for (char move : recordOfMovements.toCharArray()) {
            int tempX = x;
            int tempY = y;
            int[] delta = movementMap.get(move);
            x += delta[0];
            y += delta[1];
            String currentKey = x + "," + y;

            if (visited.contains(currentKey)) {
                bug = true;
            } else {
                for (char step : movementMap.keySet()) {
                    int[] stepDelta = movementMap.get(step);
                    int newX = x + stepDelta[0];
                    int newY = y + stepDelta[1];
                    String newKey = newX + "," + newY;

                    if ((newX != tempX || newY != tempY) && visited.contains(newKey)) {
                        bug = true;
                        break;
                    }
                }
            }

            if (bug) {
                break;
            }
            visited.add(currentKey);
        }

        System.out.println(bug ? "BUG" : "OK");
    }
}

