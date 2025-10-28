public class codeforces_96_B {
    private static java.util.ArrayList<Long> list = new java.util.ArrayList<>();
    private static final long LIMIT = 10000000000L;

    private static void gen(long number, int four, int seven) {
        if (number > LIMIT) return;
        if (number > 0 && four == seven) list.add(number);
        gen(number * 10 + 4, four + 1, seven);
        gen(number * 10 + 7, four, seven + 1);
    }

    public static void main(String[] args) {
        gen(0, 0, 0);
        java.util.Collections.sort(list);
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        long n = scanner.nextLong();
        for (long val : list) {
            if (val >= n) {
                System.out.println(val);
                return;
            }
        }
    }
}
