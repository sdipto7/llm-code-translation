
import java.util.*;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        int[] alocuente = new int[m];
        int ind = 1;
        for (int i = 0; i < t; i++) {
            String[] op = scanner.nextLine().split(" ");
            if (op[0].equals("alloc")) {
                int x = Integer.parseInt(op[1]);
                int currentStreak = 0;
                boolean found = false;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        currentStreak++;
                        if (currentStreak == x) {
                            int start = j - x + 1;
                            for (int k = start; k <= j; k++) {
                                alocuente[k] = ind;
                            }
                            System.out.println(ind);
                            ind++;
                            found = true;
                            break;
                        }
                    } else {
                        currentStreak = 0;
                    }
                }
                if (!found) {
                    System.out.println("NULL");
                }
            } else if (op[0].equals("erase")) {
                int x = Integer.parseInt(op[1]);
                if (x == 0) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                    continue;
                }
                boolean exists = false;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == x) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == x) {
                            alocuente[j] = 0;
                        }
                    }
                }
            } else if (op[0].equals("defragment")) {
                ArrayList<Integer> nonZero = new ArrayList<>();
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] != 0) {
                        nonZero.add(alocuente[j]);
                    }
                }
                int zeros = m - nonZero.size();
                for (int j = 0; j < nonZero.size(); j++) {
                    alocuente[j] = nonZero.get(j);
                }
                for (int j = nonZero.size(); j < m; j++) {
                    alocuente[j] = 0;
                }
            }
        }
    }
}

