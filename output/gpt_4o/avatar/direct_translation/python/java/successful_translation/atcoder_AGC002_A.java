
import java.util.*;
import java.io.*;

public class atcoder_AGC002_A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String S() throws IOException {
        return br.readLine().trim();
    }

    public static int I() throws IOException {
        return Integer.parseInt(br.readLine().trim());
    }

    public static List<Integer> LI() throws IOException {
        String[] parts = br.readLine().trim().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String part : parts) {
            list.add(Integer.parseInt(part));
        }
        return list;
    }

    public static List<String> LS() throws IOException {
        return Arrays.asList(br.readLine().trim().split(" "));
    }

    public static void main(String[] args) throws IOException {
        List<Integer> ab = LI();
        int a = ab.get(0);
        int b = ab.get(1);
        if (a > 0) {
            System.out.println("Positive");
        } else if (a <= 0 && b >= 0) {
            System.out.println("Zero");
        } else {
            if ((a + b) % 2 == 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Positive");
            }
        }
    }
}

