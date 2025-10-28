import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().trim().split(" ");
        String a = parts[0];
        String b = parts[1];
        int x = Math.max(a.length(), b.length());
        
        StringBuilder aBuilder = new StringBuilder(a);
        while (aBuilder.length() < x) {
            aBuilder.insert(0, '0');
        }
        a = aBuilder.toString();
        
        StringBuilder bBuilder = new StringBuilder(b);
        while (bBuilder.length() < x) {
            bBuilder.append('0');
        }
        b = bBuilder.toString();
        
        StringBuilder s = new StringBuilder();
        int c = 0;
        for (int i = 0; i < x; i++) {
            int digitB = Character.getNumericValue(b.charAt(i));
            int digitA = Character.getNumericValue(a.charAt(x - i - 1));
            int d = digitB + digitA + c;
            if (d > 9) {
                s.append(d % 10);
                c = 1;
            } else {
                s.append(d);
                c = 0;
            }
        }
        if (c == 1) {
            s.append('1');
        }
        System.out.println(Integer.parseInt(s.reverse().toString()));
    }
}
