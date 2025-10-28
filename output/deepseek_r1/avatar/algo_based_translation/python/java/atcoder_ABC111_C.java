
import java.util.ArrayList;
import java.util.Scanner;

public class atcoder_ABC111_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] xStr = scanner.nextLine().split(" ");
        ArrayList<Integer> x = new ArrayList<>();
        for (String s : xStr) {
            x.add(Integer.parseInt(s));
        }

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a.add(x.get(i));
            } else {
                b.add(x.get(i));
            }
        }

        int[] cnta = new int[100003];
        int[] cntb = new int[100003];
        for (int num : a) cnta[num]++;
        for (int num : b) cntb[num]++;

        int vala = 0, maxCnta = 0;
        for (int num : a) {
            if (cnta[num] > maxCnta) {
                maxCnta = cnta[num];
                vala = num;
            }
        }

        int vala1 = 0, maxCnta1 = 0;
        for (int num : a) {
            if (num != vala && cnta[num] > maxCnta1) {
                maxCnta1 = cnta[num];
                vala1 = num;
            }
        }

        int valb = 0, maxCntb = 0;
        for (int num : b) {
            if (cntb[num] > maxCntb) {
                maxCntb = cntb[num];
                valb = num;
            }
        }

        int valb1 = 0, maxCntb1 = 0;
        for (int num : b) {
            if (num != valb && cntb[num] > maxCntb1) {
                maxCntb1 = cntb[num];
                valb1 = num;
            }
        }

        if (vala != valb) {
            System.out.println((a.size() - maxCnta) + (b.size() - maxCntb));
        } else {
            int resa = a.size() - maxCnta;
            int resa1 = a.size() - cnta[vala1];
            int resb = b.size() - maxCntb;
            int resb1 = b.size() - cntb[valb1];
            System.out.println(Math.min(resa + resb1, resa1 + resb));
        }
    }
}

