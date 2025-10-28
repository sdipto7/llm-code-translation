
import java.util.Scanner;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int t = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] alocuente = new int[m];
        int ind = 1;

        for (int i = 0; i < t; i++) {
            String[] op = scanner.nextLine().split(" ");
            if (op[0].equals("alloc")) {
                int pos = 0;
                boolean found = false;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        pos++;
                        if (pos == Integer.parseInt(op[1])) {
                            for (int k = j - Integer.parseInt(op[1]) + 1; k <= j; k++) {
                                alocuente[k] = ind;
                            }
                            System.out.println(ind);
                            ind++;
                            found = true;
                            break;
                        }
                    } else {
                        pos = 0;
                    }
                }
                if (!found) {
                    System.out.println("NULL");
                }
            } else if (op[0].equals("erase")) {
                if (!contains(alocuente, Integer.parseInt(op[1])) || Integer.parseInt(op[1]) == 0) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == Integer.parseInt(op[1])) {
                            alocuente[j] = 0;
                        }
                    }
                }
            } else if (op[0].equals("defragment")) {
                int cnt = countZeros(alocuente);
                int[] newAlocuente = new int[m];
                int j = 0;
                for (int k = 0; k < m; k++) {
                    if (alocuente[k] != 0) {
                        newAlocuente[j++] = alocuente[k];
                    }
                }
                for (; j < m; j++) {
                    newAlocuente[j] = 0;
                }
                alocuente = newAlocuente;
            }
        }
    }

    private static boolean contains(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    private static int countZeros(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i == 0) {
                count++;
            }
        }
        return count;
    }
}

