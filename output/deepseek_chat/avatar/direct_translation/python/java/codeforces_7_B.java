
import java.util.*;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int t = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] alocuente = new int[m];
        int ind = 1;
        for (int i = 0; i < t; i++) {
            String[] op = sc.nextLine().split(" ");
            if (op[0].equals("alloc")) {
                int pos = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        pos++;
                        if (pos == Integer.parseInt(op[1])) {
                            Arrays.fill(alocuente, j - Integer.parseInt(op[1]) + 1, j + 1, ind);
                            System.out.println(ind);
                            ind++;
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
                int num = Integer.parseInt(op[1]);
                if (!contains(alocuente, num) || num == 0) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (num > 0 && alocuente[j] == num) {
                            alocuente[j] = 0;
                        }
                    }
                }
            }
            if (op[0].equals("defragment")) {
                int cnt = countZeros(alocuente);
                int[] temp = new int[m];
                int index = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] != 0) {
                        temp[index++] = alocuente[j];
                    }
                }
                for (int j = 0; j < cnt; j++) {
                    temp[index++] = 0;
                }
                alocuente = temp;
            }
        }
    }

    private static boolean contains(int[] arr, int num) {
        for (int i : arr) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }

    private static int countZeros(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i == 0) {
                count++;
            }
        }
        return count;
    }
}

