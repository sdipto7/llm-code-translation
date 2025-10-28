
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String recordOfMovements = scanner.nextLine();
        int x = 0;
        int y = 0;
        Map<Character, int[]> dMovement = new HashMap<>();
        dMovement.put('L', new int[]{0, -1});
        dMovement.put('R', new int[]{0, 1});
        dMovement.put('U', new int[]{1, 0});
        dMovement.put('D', new int[]{-1, 0});
        Map<String, String> d = new HashMap<>();
        d.put("0,0", "");
        boolean bug = false;
        
        for (char move : recordOfMovements.toCharArray()) {
            String temp = x + "," + y;
            x += dMovement.get(move)[0];
            y += dMovement.get(move)[1];
            String currentPos = x + "," + y;
            
            if (!d.containsKey(currentPos)) {
                for (char step : dMovement.keySet()) {
                    int neighborX = x + dMovement.get(step)[0];
                    int neighborY = y + dMovement.get(step)[1];
                    String neighborPos = neighborX + "," + neighborY;
                    if (!neighborPos.equals(temp) && d.containsKey(neighborPos)) {
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
            
            d.put(currentPos, "");
        }
        
        if (bug) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}

