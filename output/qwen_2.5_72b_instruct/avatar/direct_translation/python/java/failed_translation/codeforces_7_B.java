import java.util.Scanner;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;
        for (int i = 0; i < t; i++) {
            String[] op = scanner.next().split(" ");
            if (op[0].equals("alloc")) {
                int pos = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        pos += 1;
                        if (pos == Integer.parseInt(op[1])) {
                            for (int k = j - Integer.parseInt(op[1]) + 1; k <= j; k++) {
                                alocuente[k] = ind;
                            }
                            System.out.println(ind);
                            ind += 1;
                            break;
                        }
                    } else {
                        pos = 0;
                    }
                }
                if (pos != Integer.parseInt(op[1])) {
                    System.out.println("NULL");
                }
            }
            if (op[0].equals("erase")) {
                if (Integer.parseInt(op[1]) == 0 || !contains(alocuente, Integer.parseInt(op[1]))) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == Integer.parseInt(op[1])) {
                            alocuente[j] = 0;
                        }
                    }
                }
            }
            if (op[0].equals("defragment")) {
                int cnt = 0;
                for (int j : alocuente) {
                    if (j == 0) {
                        cnt += 1;
                    }
                }
                int[] temp = new int[m];
                int index = 0;
                for (int j : alocuente) {
                    if (j != 0) {
                        temp[index++] = j;
                    }
                }
                for (int j = 0; j < cnt; j++) {
                    temp[index++] = 0;
                }
                alocuente = temp;
            }
        }
    }

    public static boolean contains(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
