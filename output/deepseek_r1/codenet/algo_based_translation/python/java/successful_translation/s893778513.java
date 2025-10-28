
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class s893778513 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        List<Integer> l = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        int b = l.stream().mapToInt(Integer::intValue).max().getAsInt();
        int s = l.stream().mapToInt(Integer::intValue).sum();
        System.out.println(b < (s - b) ? "Yes" : "No");
    }
}

