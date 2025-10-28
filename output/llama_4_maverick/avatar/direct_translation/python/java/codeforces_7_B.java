
import java.util.Scanner;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int t = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        int[] alocuente = new int[m];
        int ind = 1;

        for (int i = 0; i < t; i++) {
            line = scanner.nextLine().split(" ");
            if (line[0].equals("alloc")) {
                int pos = 0;
                int size = Integer.parseInt(line[1]);
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        pos++;
                        if (pos == size) {
                            for (int k = j - size + 1; k <= j; k++) {
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
                if (pos != size) {
                    System.out.println("NULL");
                }
            }
            if (line[0].equals("erase")) {
                int arg = Integer.parseInt(line[1]);
                boolean found = false;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == arg) {
                        found = true;
                        break;
                    }
                }
                if (!found || arg == 0) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == arg) {
                            alocuente[j] = 0;
                        }
                    }
                }
            }
            if (line[0].equals("defragment")) {
                int cnt = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        cnt++;
                    }
                }
                int[] newAlocuente = new int[m];
                int idx = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] != 0) {
                        newAlocuente[idx++] = alocuente[j];
                    }
                }
                for (int j = idx; j < m; j++) {
                    newAlocuente[j] = 0;
                }
                alocuente = newAlocuente;
            }
        }
    }
}

