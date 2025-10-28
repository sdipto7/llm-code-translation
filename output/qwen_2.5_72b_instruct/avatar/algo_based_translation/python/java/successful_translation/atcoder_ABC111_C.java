
import java.util.Scanner;

public class atcoder_ABC111_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        int[] a = new int[n / 2 + 1];
        int[] b = new int[n / 2 + 1];
        int aIndex = 0, bIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a[aIndex++] = x[i];
            } else {
                b[bIndex++] = x[i];
            }
        }
        int[] cnta = new int[100003];
        int[] cntb = new int[100003];
        int vala = 0, vala1 = 0, maxCnta = 0, maxCnta1 = 0;
        for (int i = 0; i < aIndex; i++) {
            cnta[a[i]]++;
        }
        for (int i = 0; i < aIndex; i++) {
            if (cnta[a[i]] > maxCnta) {
                vala = a[i];
                maxCnta = cnta[a[i]];
            }
        }
        for (int i = 0; i < aIndex; i++) {
            if (cnta[a[i]] > maxCnta1 && a[i] != vala) {
                maxCnta1 = cnta[a[i]];
                vala1 = a[i];
            }
        }
        int valb = 0, valb1 = 0, maxCntb = 0, maxCntb1 = 0;
        for (int i = 0; i < bIndex; i++) {
            cntb[b[i]]++;
        }
        for (int i = 0; i < bIndex; i++) {
            if (cntb[b[i]] > maxCntb) {
                valb = b[i];
                maxCntb = cntb[b[i]];
            }
        }
        for (int i = 0; i < bIndex; i++) {
            if (cntb[b[i]] > maxCntb1 && b[i] != valb) {
                maxCntb1 = cntb[b[i]];
                valb1 = b[i];
            }
        }
        if (valb != vala) {
            int res = 0;
            for (int i = 0; i < aIndex; i++) {
                if (a[i] != vala) {
                    res++;
                }
            }
            for (int i = 0; i < bIndex; i++) {
                if (b[i] != valb) {
                    res++;
                }
            }
            System.out.println(res);
        } else {
            int resa = 0, resa1 = 0, resb = 0, resb1 = 0;
            for (int i = 0; i < aIndex; i++) {
                if (a[i] != vala) {
                    resa++;
                }
                if (a[i] != vala1) {
                    resa1++;
                }
            }
            for (int i = 0; i < bIndex; i++) {
                if (b[i] != valb) {
                    resb++;
                }
                if (b[i] != valb1) {
                    resb1++;
                }
            }
            System.out.println(Math.min(resa + resb1, resa1 + resb));
        }
        scanner.close();
    }
}

