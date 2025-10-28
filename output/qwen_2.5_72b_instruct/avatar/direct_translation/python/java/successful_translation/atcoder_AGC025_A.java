
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        List<String> a = Arrays.asList("10", "100", "1000", "10000", "100000");
        int newSum = n.chars().map(Character::getNumericValue).sum();
        if (a.contains(n)) {
            System.out.println(10);
        } else {
            System.out.println(newSum);
        }
    }
}

