
import java.util.*;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;
        
        for (int i = 0; i < t; i++) {
            String op = scanner.next();
            if (op.equals("alloc")) {
                int size = scanner.nextInt();
                int pos = 0;
                boolean allocated = false;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        pos++;
                        if (pos == size) {
                            for (int k = j - size + 1; k <= j; k++) {
                                alocuente[k] = ind;
                            }
                            System.out.println(ind);
                            ind++;
                            allocated = true;
                            break;
                        }
                    } else {
                        pos = 0;
                    }
                }
                if (!allocated) {
                    System.out.println("NULL");
                }
            }
            if (op.equals("erase")) {
                int eraseId = scanner.nextInt();
                if (eraseId <= 0 || !contains(alocuente, eraseId)) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == eraseId) {
                            alocuente[j] = 0;
                        }
                    }
                }
            }
            if (op.equals("defragment")) {
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
    
    private static boolean contains(int[] arr, int val) {
        for (int i : arr) {
            if (i == val) {
                return true;
            }
        }
        return false;
    }
}

