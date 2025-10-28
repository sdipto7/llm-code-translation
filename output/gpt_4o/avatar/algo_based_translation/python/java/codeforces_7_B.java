
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline

        int[] alocuente = new int[m];
        int ind = 1;

        for (int i = 0; i < t; i++) {
            String[] op = scanner.nextLine().split(" ");

            if (op[0].equals("alloc")) {
                int pos = 0;
                int size = Integer.parseInt(op[1]);
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        pos++;
                        if (pos == size) {
                            Arrays.fill(alocuente, j - size + 1, j + 1, ind);
                            System.out.println(ind);
                            ind++;
                            break;
                        }
                    } else {
                        pos = 0;
                    }
                }
                if (pos < size) {
                    System.out.println("NULL");
                }
            }

            if (op[0].equals("erase")) {
                int id = Integer.parseInt(op[1]);
                if (id <= 0 || !contains(alocuente, id)) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == id) {
                            alocuente[j] = 0;
                        }
                    }
                }
            }

            if (op[0].equals("defragment")) {
                int cnt = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] != 0) {
                        alocuente[cnt++] = alocuente[j];
                    }
                }
                while (cnt < m) {
                    alocuente[cnt++] = 0;
                }
            }
        }

        scanner.close();
    }

    private static boolean contains(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }
}

