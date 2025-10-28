
import java.util.*;

public class atcoder_ABC142_C {
    static class Element {
        int index;
        int value;
        Element(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] parts = scanner.nextLine().trim().split("\\s+");
        
        List<Element> elements = new ArrayList<>();
        for (int i = 0; i < parts.length; i++) {
            elements.add(new Element(i + 1, Integer.parseInt(parts[i])));
        }
        
        elements.sort(Comparator.comparingInt(e -> e.value));
        
        List<Integer> sortedIndices = new ArrayList<>();
        for (Element e : elements) {
            sortedIndices.add(e.index);
        }
        
        if (!sortedIndices.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < sortedIndices.size() - 1; i++) {
                sb.append(sortedIndices.get(i)).append(" ");
            }
            sb.append(sortedIndices.get(sortedIndices.size() - 1));
            System.out.println(sb);
        }
    }
}

