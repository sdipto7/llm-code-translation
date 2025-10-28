
import java.util.*;

public class codeforces_400_A {

    public static Tuple<Integer, Integer[]> value() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        Integer[] values = Arrays.stream(inputs).map(Integer::parseInt).toArray(Integer[]::new);
        return new Tuple<>(inputs.length, values);
    }

    public static Tuple<Integer, Integer[]> values() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        Integer[] values = Arrays.stream(inputs).map(Integer::parseInt).toArray(Integer[]::new);
        return new Tuple<>(inputs.length, values);
    }

    public static List<Integer> inlst() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        List<Integer> values = new ArrayList<>();
        for (String input : inputs) {
            values.add(Integer.parseInt(input));
        }
        return values;
    }

    public static List<Integer> inlsts() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        List<Integer> values = new ArrayList<>();
        for (String input : inputs) {
            values.add(Integer.parseInt(input));
        }
        return values;
    }

    public static int inp() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    public static int inps() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    public static String instr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static List<String> stlst() {
        Scanner scanner = new Scanner(System.in);
        return Arrays.asList(scanner.nextLine().split(" "));
    }

    public static boolean help(int a, int b, List<Integer> l) {
        List<List<Integer>> tot = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            tot.add(l.subList(i * a, i * a + a));
        }
        for (int i = 0; i < a; i++) {
            int sum = 0;
            for (List<Integer> sublist : tot) {
                sum += sublist.get(i);
            }
            if (sum == b) {
                return true;
            }
        }
        return false;
    }

    public static void solve() {
        List<Tuple<Integer, Integer>> tot = new ArrayList<>();
        String x = instr();
        List<Integer> s = new ArrayList<>();
        for (char i : x.toCharArray()) {
            if (i == 'O') {
                s.add(0);
            } else {
                s.add(1);
            }
        }
        for (int i = 1; i <= 12; i++) {
            if (12 % i == 0) {
                if (help(i, 12 / i, s)) {
                    tot.add(new Tuple<>(12 / i, i));
                }
            }
        }
        System.out.print(tot.size() + " ");
        tot.sort(Comparator.comparing(Tuple::getFirst));
        for (Tuple<Integer, Integer> pair : tot) {
            System.out.print(pair.getFirst() + "x" + pair.getSecond() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = inp();
        for (int i = 0; i < cases; i++) {
            solve();
        }
    }

    static class Tuple<X, Y> {
        private final X first;
        private final Y second;

        public Tuple(X first, Y second) {
            this.first = first;
            this.second = second;
        }

        public X getFirst() {
            return first;
        }

        public Y getSecond() {
            return second;
        }
    }
}

