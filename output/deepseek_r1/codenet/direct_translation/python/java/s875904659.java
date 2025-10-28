
import java.util.Arrays;
import java.util.Scanner;

public class s875904659 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] cards = scanner.nextLine().split(" ");
        String[] cards2 = Arrays.copyOf(cards, cards.length);
        
        bubbleSort(cards);
        System.out.println("Stable");
        
        selectionSort(cards2);
        if (Arrays.equals(cards, cards2)) {
            System.out.println("Stable");
        } else {
            System.out.println("Not stable");
        }
    }
    
    public static void bubbleSort(String[] cards) {
        int n = cards.length;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                int current = Integer.parseInt(cards[j].substring(1));
                int prev = Integer.parseInt(cards[j - 1].substring(1));
                if (current < prev) {
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
            int minIndex = i;
            for (int j = i; j < n; j++) {
                int current = Integer.parseInt(cards[j].substring(1));
                int minVal = Integer.parseInt(cards[minIndex].substring(1));
                if (current < minVal) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                String temp = cards[i];
                cards[i] = cards[minIndex];
                cards[minIndex] = temp;
            }
        }
        System.out.println(String.join(" ", cards));
    }
}

