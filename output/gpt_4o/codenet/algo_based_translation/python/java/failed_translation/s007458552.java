
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class s007458552 {

    public static void main(String[] args) {
        System.out.println(mainLogic());
    }

    public static int[] LI() {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int[] result = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            result[i] = Integer.parseInt(line[i]);
        }
        return result;
    }

    public static int[] LI_() {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int[] result = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            result[i] = Integer.parseInt(line[i]) - 1;
        }
        return result;
    }

    public static String[] LS() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().split(" ");
    }

    public static int II() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    public static String SI() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String mainLogic() {
        int n = II();
        String S = SI();
        Map<Character, Integer> C = new HashMap<>();
        
        for (char c : S.toCharArray()) {
            C.put(c, C.getOrDefault(c, 0) + 1);
        }

        int countR = C.getOrDefault('R', 0);
        
        if (countR > n - countR) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

