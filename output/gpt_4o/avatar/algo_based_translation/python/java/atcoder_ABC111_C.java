
import java.util.*;

public class atcoder_ABC111_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> x = new ArrayList<>();
        for (String num : scanner.nextLine().split(" ")) {
            x.add(Integer.parseInt(num));
        }
        System.out.println(minChanges(n, x));
    }

    public static int minChanges(int n, List<Integer> x) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a.add(x.get(i));
            } else {
                b.add(x.get(i));
            }
        }

        int[] cnta = new int[100003];
        int[] cntb = new int[100003];
        int vala = 0, vala1 = 0, maxCnta = 0, maxCnta1 = 0;
        int valb = 0, valb1 = 0, maxCntb = 0, maxCntb1 = 0;

        for (int num : a) {
            cnta[num]++;
        }
        for (int num : a) {
            if (cnta[num] > maxCnta) {
                vala = num;
                maxCnta = cnta[num];
            }
        }
        for (int num : a) {
            if (cnta[num] > maxCnta1 && num != vala) {
                vala1 = num;
                maxCnta1 = cnta[num];
            }
        }

        for (int num : b) {
            cntb[num]++;
        }
        for (int num : b) {
            if (cntb[num] > maxCntb) {
                valb = num;
                maxCntb = cntb[num];
            }
        }
        for (int num : b) {
            if (cntb[num] > maxCntb1 && num != valb) {
                valb1 = num;
                maxCntb1 = cntb[num];
            }
        }

        if (valb != vala) {
            int res = 0;
            for (int num : a) {
                if (num != vala) {
                    res++;
                }
            }
            for (int num : b) {
                if (num != valb) {
                    res++;
                }
            }
            return res;
        } else {
            int resa = 0, resb = 0, resa1 = 0, resb1 = 0;
            for (int num : a) {
                if (num != vala) {
                    resa++;
                }
                if (num != vala1) {
                    resa1++;
                }
            }
            for (int num : b) {
                if (num != valb) {
                    resb++;
                }
                if (num != valb1) {
                    resb1++;
                }
            }
            return Math.min(resa + resb1, resa1 + resb);
        }
    }
}

