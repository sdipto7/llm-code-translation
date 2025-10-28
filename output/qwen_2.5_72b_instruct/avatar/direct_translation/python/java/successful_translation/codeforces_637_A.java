import java.util.HashMap;
import java.util.Scanner;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String[] s = input.nextLine().trim().split(" ");
        HashMap<String, Integer> w = new HashMap<>();
        for (String i : s) {
            w.put(i, w.getOrDefault(i, 0) + 1);
        }
        String[] reversed = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            reversed[i] = s[s.length - 1 - i];
        }
        int c = -1;
        String a = "";
        for (String i : w.keySet()) {
            if (w.get(i) == w.values().stream().max(Integer::compare).get()) {
                int index = java.util.Arrays.asList(reversed).indexOf(i);
                if (index > c) {
                    a = i;
                    c = index;
                }
            }
        }
        System.out.println(a);
    }
}
