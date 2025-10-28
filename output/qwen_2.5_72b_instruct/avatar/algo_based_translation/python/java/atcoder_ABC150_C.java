import java.util.*;
import java.util.stream.*;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> orig = new ArrayList<>(generatePermutations(n));
        Tuple p = readTuple(scanner);
        Tuple q = readTuple(scanner);
        int pn = orig.indexOf(p.toList());
        int qn = orig.indexOf(q.toList());
        System.out.println(Math.abs(pn - qn));
    }

    private static List<List<Integer>> generatePermutations(int n) {
        List<Integer> numbers = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
        List<List<Integer>> permutations = new ArrayList<>();
        permute(numbers, 0, permutations);
        return permutations;
    }

    private static void permute(List<Integer> numbers, int start, List<List<Integer>> permutations) {
        if (start == numbers.size() - 1) {
            permutations.add(new ArrayList<>(numbers));
        } else {
            for (int i = start; i < numbers.size(); i++) {
                Collections.swap(numbers, i, start);
                permute(numbers, start + 1, permutations);
                Collections.swap(numbers, start, i);
            }
        }
    }

    private static Tuple readTuple(Scanner scanner) {
        List<Integer> tupleList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            tupleList.add(scanner.nextInt());
        }
        return new Tuple(tupleList);
    }
}

class Tuple {
    private final List<Integer> elements;

    public Tuple(List<Integer> elements) {
        this.elements = elements;
    }

    public List<Integer> toList() {
        return new ArrayList<>(elements);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple tuple = (Tuple) o;
        return elements.equals(tuple.elements);
    }

    @Override
    public int hashCode() {
        return elements.hashCode();
    }
}
