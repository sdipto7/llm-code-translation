import java.util.Scanner;
import java.util.Arrays;

public class s875904659 {
    public static void bubbleSort(String[] cards) {
        int n = cards.length;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                int currentVal = Integer.parseInt(cards[j].substring(1));
                int prevVal = Integer.parseInt(cards[j - 1].substring(1));
                if (currentVal < prevVal) {
                    String temp = cards[j];
                    cards[j] = cards[j - 1];
                    cards[j - 1] = temp;
                }
            }
        }
        System.out.println(String.join(" ", cards));
    }

    public static void selectionSort(String[] cards) {
        int n = cards.length;
        for (int i = 0; i < n; i++) {
            int mini = i;
            for (int j = i; j < n; j++) {
                int currentVal = Integer.parseInt(cards[j].substring(1));
                int minVal = Integer.parseInt(cards[mini].substring(1));
                if (currentVal < minVal) {
                    mini = j;
                }
            }
            if (mini != i) {
                String temp = cards[i];
                cards[i] = cards[mini];
                cards[mini] = temp;
            }
        }
        System.out.println(String.join(" ", cards));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] cards = scanner.nextLine().split(" ");
        String[] cards2 = Arrays.copyOf(cards, cards.length);
        
        bubbleSort(cards);
        System.out.println("Stable");
        selectionSort(cards2);
        if (Arrays.equals(cards2, cards)) {
            System.out.println("Stable");
        } else {
            System.out.println("Not stable");
        }
    }
}
