
import java.util.*;

public class s957164965 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        List<Integer> p = new ArrayList<>();
        for (int j = 0; j < N; j++) {
            p.add(scanner.nextInt());
        }

        // Sort the list p
        Collections.sort(p);

        // Initialize an empty dictionary candidates
        Map<Integer, List<Integer>> candidates = new HashMap<>();

        // Loop from -1 to 101 (inclusive)
        for (int i = -1; i <= 101; i++) {
            // Check if i is in list p
            if (p.contains(i)) {
                continue;
            }

            // Calculate the absolute difference abs(X - i)
            int difference = Math.abs(X - i);

            // If this difference is not already a key in candidates
            if (!candidates.containsKey(difference)) {
                // Add a new entry
                candidates.put(difference, new ArrayList<>(Arrays.asList(i)));
            } else {
                // Else, append i to the list at candidates[abs(X-i)]
                candidates.get(difference).add(i);
            }
        }

        // Find the smallest key in candidates
        int smallest = Collections.min(candidates.keySet());

        // Find the smallest integer in candidates[smallest]
        int minNum = Collections.min(candidates.get(smallest));

        // Output
        System.out.println(minNum);
    }
}

