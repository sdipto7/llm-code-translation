
import java.util.*;

public class atcoder_ABC111_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] parts = sc.nextLine().split(" ");
        List<Integer> x = new ArrayList<>();
        for (String part : parts) {
            x.add(Integer.parseInt(part));
        }
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
        for (int num : a) {
            cnta[num]++;
        }
        for (int num : b) {
            cntb[num]++;
        }
        
        int vala = 0, maxCnta = 0;
        for (int num : a) {
            if (cnta[num] > maxCnta) {
                maxCnta = cnta[num];
                vala = num;
            }
        }
        int vala1 = 0, maxCnta1 = 0;
        for (int num : a) {
            if (cnta[num] > maxCnta1 && num != vala) {
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
            if (cntb[num] > maxCntb1 && num != valb) {
                maxCntb1 = cntb[num];
                valb1 = num;
            }
        }
        
        if (vala != valb) {
            System.out.println((a.size() - maxCnta) + (b.size() - maxCntb));
        } else {
            int option1 = (a.size() - maxCnta) + (b.size() - maxCntb1);
            int option2 = (a.size() - maxCnta1) + (b.size() - maxCntb);
            System.out.println(Math.min(option1, option2));
        }
    }
}

