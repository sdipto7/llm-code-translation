import java.util.Scanner;

public class s993625131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> S = Arrays.asList(input.split(""));
        int count = 0;
        int record = 0;

        for (int i = 0; i < S.size(); i++) {
            if (S.get(i).equals("A") || S.get(i).equals("C") || S.get(i).equals("G") || S.get(i).equals("T")) {
                count += 1;
            } else {
                if (count > record) {
                    record = count;
                }
                count = 0;
            }
        }
        if (count > record) {
            record = count;
        }
        System.out.println(record);
    }
}
