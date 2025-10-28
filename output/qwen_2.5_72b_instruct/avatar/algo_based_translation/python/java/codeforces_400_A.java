
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class codeforces_400_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = inp(scanner);
        for (int i = 0; i < t; i++) {
            solve(scanner);
        }
        scanner.close();
    }

    public static Tuple[] value() {
        String[] input = instr().split(" ");
        Tuple[] result = new Tuple[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = new Tuple(Integer.parseInt(input[i]));
        }
        return result;
    }

    public static Tuple[] values(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        Tuple[] result = new Tuple[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = new Tuple(Integer.parseInt(input[i]));
        }
        return result;
    }

    public static List<Integer> inlst() {
        String[] input = instr().split(" ");
        List<Integer> result = new ArrayList<>();
        for (String s : input) {
            result.add(Integer.parseInt(s));
        }
        return result;
    }

    public static List<Integer> inlsts(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        List<Integer> result = new ArrayList<>();
        for (String s : input) {
            result.add(Integer.parseInt(s));
        }
        return result;
    }

    public static int inp() {
        return Integer.parseInt(instr());
    }

    public static int inps(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    public static String instr() {
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        scanner.close();
        return result;
    }

    public static List<String> stlst() {
        String[] input = instr().split(" ");
        List<String> result = new ArrayList<>();
        for (String s : input) {
            result.add(s);
        }
        return result;
    }

    public static boolean help(int a, int b, List<Integer> l) {
        List<List<Integer>> tot = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            List<Integer> sublist = new ArrayList<>(l.subList(i * a, i * a + a));
            tot.add(sublist);
        }
        List<Integer>[] arrays = new List[tot.size()];
        tot.toArray(arrays);
        for (List<Integer> i : transpose(arrays)) {
            if (i.stream().mapToInt(Integer::intValue).sum() == b) {
                return true;
            }
        }
        return false;
    }

    public static void solve(Scanner scanner) {
        List<Integer> tot = new ArrayList<>();
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
                    tot.add((12 / i) * 100 + i);
                }
            }
        }
        Collections.sort(tot);
        System.out.print(tot.size() + " ");
        for (int item : tot) {
            int a = item / 100;
            int b = item % 100;
            System.out.print(a + "x" + b + " ");
        }
        System.out.println();
    }

    public static int inp(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    private static <T> List<List<T>> transpose(List<T>[] lists) {
        List<List<T>> transposed = new ArrayList<>();
        if (lists.length == 0) return transposed;
        for (int i = 0; i < lists[0].size(); i++) {
            List<T> newList = new ArrayList<>();
            for (List<T> list : lists) {
                newList.add(list.get(i));
            }
            transposed.add(newList);
        }
        return transposed;
    }
}

class Tuple {
    int value;

    Tuple(int value) {
        this.value = value;
    }
}

