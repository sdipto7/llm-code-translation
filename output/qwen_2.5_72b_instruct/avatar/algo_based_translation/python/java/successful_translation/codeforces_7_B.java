
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String[] op = scanner.nextLine().split(" ");
            if (op[0].equals("alloc")) {
                int pos = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        pos++;
                        if (pos == Integer.parseInt(op[1])) {
                            for (int k = j - Integer.parseInt(op[1]) + 1; k <= j; k++) {
                                alocuente[k] = ind;
                            }
                            System.out.println(ind);
                            ind++;
                            break;
                        }
                    } else {
                        pos = 0;
                    }
                }
                if (pos < Integer.parseInt(op[1])) {
                    System.out.println("NULL");
                }
            } else if (op[0].equals("erase")) {
                int value = Integer.parseInt(op[1]);
                if (value == 0 || !contains(alocuente, value)) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == value) {
                            alocuente[j] = 0;
                        }
                    }
                }
            } else if (op[0].equals("defragment")) {
                List<Integer> nonZeroElements = new ArrayList<>();
                for (int num : alocuente) {
                    if (num != 0) {
                        nonZeroElements.add(num);
                    }
                }
                for (int j = 0; j < m; j++) {
                    if (j < nonZeroElements.size()) {
                        alocuente[j] = nonZeroElements.get(j);
                    } else {
                        alocuente[j] = 0;
                    }
                }
            }
        }
        scanner.close();
    }

    private static boolean contains(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}

