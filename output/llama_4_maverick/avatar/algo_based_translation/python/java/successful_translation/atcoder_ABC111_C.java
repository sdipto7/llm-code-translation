
import java.util.Scanner;

public class atcoder_ABC111_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        int[] a = new int[(n + 1) / 2];
        int[] b = new int[n / 2];
        int indexA = 0, indexB = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a[indexA++] = x[i];
            } else {
                b[indexB++] = x[i];
            }
        }
        int[] cnta = new int[100003];
        int[] cntb = new int[100003];
        int vala = 0, vala1 = 0, maxCnta = 0, maxCnta1 = 0;
        int valb = 0, valb1 = 0, maxCntb = 0, maxCntb1 = 0;
        for (int i : a) {
            cnta[i]++;
        }
        for (int i : a) {
            if (cnta[i] > maxCnta) {
                vala = i;
                maxCnta = cnta[i];
            }
        }
        for (int i : a) {
            if (cnta[i] > maxCnta1 && i != vala) {
                vala1 = i;
                maxCnta1 = cnta[i];
            }
        }
        for (int i : b) {
            cntb[i]++;
        }
        for (int i : b) {
            if (cntb[i] > maxCntb) {
                valb = i;
                maxCntb = cntb[i];
            }
        }
        for (int i : b) {
            if (cntb[i] > maxCntb1 && i != valb) {
                valb1 = i;
                maxCntb1 = cntb[i];
            }
        }
        if (vala != valb) {
            int res = 0;
            for (int i : a) {
                if (i != vala) {
                    res++;
                }
            }
            for (int i : b) {
                if (i != valb) {
                    res++;
                }
            }
            System.out.println(res);
        } else {
            int resa = 0, resb = 0, resa1 = 0, resb1 = 0;
            for (int i : a) {
                if (i != vala) {
                    resa++;
                }
                if (i != vala1) {
                    resa1++;
                }
            }
            for (int i : b) {
                if (i != valb) {
                    resb++;
                }
                if (i != valb1) {
                    resb1++;
                }
            }
            System.out.println(Math.min(resa + resb1, resa1 + resb));
        }
    }
}

