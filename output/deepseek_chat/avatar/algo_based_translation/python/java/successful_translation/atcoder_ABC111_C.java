
import java.util.Scanner;
import java.util.ArrayList;

public class atcoder_ABC111_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(scanner.nextInt());
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
        
        for (int num : a) {
            cnta[num]++;
        }
        for (int num : b) {
            cntb[num]++;
        }
        
        int vala = 0;
        int vala1 = 0;
        int maxCnta = 0;
        int maxCnta1 = 0;
        
        for (int num : a) {
            if (cnta[num] > maxCnta) {
                maxCnta = cnta[num];
                vala = num;
            }
        }
        for (int num : a) {
            if (cnta[num] > maxCnta1 && num != vala) {
                maxCnta1 = cnta[num];
                vala1 = num;
            }
        }
        
        int valb = 0;
        int valb1 = 0;
        int maxCntb = 0;
        int maxCntb1 = 0;
        
        for (int num : b) {
            if (cntb[num] > maxCntb) {
                maxCntb = cntb[num];
                valb = num;
            }
        }
        for (int num : b) {
            if (cntb[num] > maxCntb1 && num != valb) {
                maxCntb1 = cntb[num];
                valb1 = num;
            }
        }
        
        if (vala != valb) {
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
            System.out.println(res);
        } else {
            int resa = 0;
            int resb = 0;
            int resa1 = 0;
            int resb1 = 0;
            
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
            
            int result = Math.min(resa + resb1, resa1 + resb);
            System.out.println(result);
        }
    }
}

