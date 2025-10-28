
import java.util.*;
import java.io.*;

public class codeforces_61_B {
    public static boolean valid(int i, int j, int n, int m) {
        return i < n && i >= 0 && j >= 0 && j < m;
    }
    
    public static double sumn(int i, int n) {
        return (n - i) * (i + n) / 2.0;
    }
    
    public static double sqfun(double a, double b, double c) {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
    
    public static int[] value() throws IOException {
        String[] parts = br.readLine().split(" ");
        int[] result = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }
        return result;
    }
    
    public static int[] values() throws IOException {
        String[] parts = br.readLine().split(" ");
        int[] result = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }
        return result;
    }
    
    public static int[] inlst() throws IOException {
        String[] parts = br.readLine().split(" ");
        int[] result = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }
        return result;
    }
    
    public static int[] inlsts() throws IOException {
        String[] parts = br.readLine().split(" ");
        int[] result = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }
        return result;
    }
    
    public static int inp() throws IOException {
        return Integer.parseInt(br.readLine());
    }
    
    public static int inps() throws IOException {
        return Integer.parseInt(br.readLine());
    }
    
    public static String instr() throws IOException {
        return br.readLine();
    }
    
    public static String[] stlst() throws IOException {
        return br.readLine().split(" ");
    }
    
    public static String f(String s) {
        StringBuilder r = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '-' && c != ';' && c != '_') {
                r.append(Character.toLowerCase(c));
            }
        }
        return r.toString();
    }
    
    public static void solve() throws IOException {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(f(br.readLine()));
        }
        
        Set<String> permutations = new HashSet<>();
        List<String> temp = new ArrayList<>(list);
        Collections.sort(temp);
        do {
            StringBuilder sb = new StringBuilder();
            for (String s : temp) {
                sb.append(s);
            }
            permutations.add(sb.toString());
        } while (nextPermutation(temp));
        
        int n = inp();
        for (int i = 0; i < n; i++) {
            String test = f(instr());
            if (permutations.contains(test)) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }
    
    private static boolean nextPermutation(List<String> list) {
        int i = list.size() - 2;
        while (i >= 0 && list.get(i).compareTo(list.get(i + 1)) >= 0) {
            i--;
        }
        if (i < 0) return false;
        
        int j = list.size() - 1;
        while (list.get(j).compareTo(list.get(i)) <= 0) {
            j--;
        }
        
        Collections.swap(list, i, j);
        Collections.reverse(list.subList(i + 1, list.size()));
        return true;
    }
    
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        solve();
    }
}

