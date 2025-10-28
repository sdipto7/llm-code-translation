
import java.util.*;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        
        int[] alocuente = new int[m];
        Arrays.fill(alocuente, 0);
        int ind = 1;
        
        for (int i = 0; i < t; i++) {
            String[] op = scanner.nextLine().split(" ");
            
            if (op[0].equals("alloc")) {
                int pos = 0;
                boolean allocated = false;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        pos++;
                        if (pos == Integer.parseInt(op[1])) {
                            int start = j - Integer.parseInt(op[1]) + 1;
                            for (int k = start; k <= j; k++) {
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
            
            if (op[0].equals("erase")) {
                int target = Integer.parseInt(op[1]);
                boolean found = false;
                for (int value : alocuente) {
                    if (value == target) {
                        found = true;
                        break;
                    }
                }
                
                if (!found || target == 0) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (target > 0 && alocuente[j] == target) {
                            alocuente[j] = 0;
                        }
                    }
                }
            }
            
            if (op[0].equals("defragment")) {
                int cnt = 0;
                for (int value : alocuente) {
                    if (value == 0) {
                        cnt++;
                    }
                }
                
                int[] temp = new int[m];
                int index = 0;
                for (int value : alocuente) {
                    if (value != 0) {
                        temp[index++] = value;
                    }
                }
                for (int j = 0; j < cnt; j++) {
                    temp[index++] = 0;
                }
                alocuente = temp;
            }
        }
        scanner.close();
    }
}

