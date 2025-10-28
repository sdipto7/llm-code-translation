
import java.util.*;

public class codeforces_400_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            solve(scanner);
        }
        scanner.close();
    }

    private static void solve(Scanner scanner) {
        String input = scanner.nextLine();
        List<Integer> bits = new ArrayList<>();
        for (char c : input.toCharArray()) {
            bits.add(c == 'X' ? 1 : 0);
        }

        List<int[]> validConfigs = new ArrayList<>();
        for (int cols = 1; cols <= 12; cols++) {
            if (12 % cols != 0) continue;
            int rows = 12 / cols;
            if (hasValidColumn(cols, rows, bits)) {
                validConfigs.add(new int[]{rows, cols});
            }
        }

        validConfigs.sort((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        
        StringBuilder output = new StringBuilder();
        output.append(validConfigs.size()).append(" ");
        for (int[] config : validConfigs) {
            output.append(config[0]).append("x").append(config[1]).append(" ");
        }
        System.out.println(output.toString().trim());
    }

    private static boolean hasValidColumn(int cols, int rows, List<Integer> bits) {
        for (int c = 0; c < cols; c++) {
            boolean valid = true;
            for (int r = 0; r < rows; r++) {
                int index = r * cols + c;
                if (bits.get(index) != 1) {
                    valid = false;
                    break;
                }
            }
            if (valid) return true;
        }
        return false;
    }
}

