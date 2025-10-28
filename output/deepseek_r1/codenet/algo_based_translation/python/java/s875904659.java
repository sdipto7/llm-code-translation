
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class s875904659 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> cards = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
        ArrayList<String> cards2 = new ArrayList<>(cards);
        
        bubbleSort(cards);
        System.out.println("Stable");
        selectionSort(cards2);
        System.out.println(String.join(" ", cards).equals(String.join(" ", cards2)) ? "Stable" : "Not stable");
    }

    public static void bubbleSort(ArrayList<String> cards) {
        int n = cards.size();
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                int current = cards.get(j).charAt(1) - '0';
                int prev = cards.get(j-1).charAt(1) - '0';
                if (current < prev) {
                    String temp = cards.get(j);
                    cards.set(j, cards.get(j-1));
                    cards.set(j-1, temp);
                }
            }
        }
        System.out.println(String.join(" ", cards));
    }

    public static void selectionSort(ArrayList<String> cards) {
        int n = cards.size();
        for (int i = 0; i < n; i++) {
            int mini = i;
            for (int j = i; j < n; j++) {
                int current = cards.get(j).charAt(1) - '0';
                int minVal = cards.get(mini).charAt(1) - '0';
                if (current < minVal) {
                    mini = j;
                }
            }
            if (mini != i) {
                String temp = cards.get(i);
                cards.set(i, cards.get(mini));
                cards.set(mini, temp);
            }
        }
        System.out.println(String.join(" ", cards));
    }
}

