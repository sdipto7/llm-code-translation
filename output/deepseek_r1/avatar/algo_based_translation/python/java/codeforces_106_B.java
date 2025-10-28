
import java.util.*;

public class codeforces_106_B {
    static class Entry {
        int s, r, h, c;

        Entry(int s, int r, int h, int c) {
            this.s = s;
            this.r = r;
            this.h = h;
            this.c = c;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Entry entry = (Entry) o;
            return s == entry.s && r == entry.r && h == entry.h && c == entry.c;
        }

        @Override
        public int hashCode() {
            return Objects.hash(s, r, h, c);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Entry> inputList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int s = scanner.nextInt();
            int r = scanner.nextInt();
            int h = scanner.nextInt();
            int c = scanner.nextInt();
            inputList.add(new Entry(s, r, h, c));
        }

        Set<Entry> outdated = new HashSet<>();

        for (int i = 0; i < inputList.size(); i++) {
            Entry current = inputList.get(i);
            for (int j = 0; j < inputList.size(); j++) {
                Entry other = inputList.get(j);
                if (current.s < other.s && current.r < other.r && current.h < other.h) {
                    outdated.add(current);
                }
            }
        }

        int minCost = 100000;
        int resultIndex = 0;

        for (int i = 0; i < inputList.size(); i++) {
            Entry entry = inputList.get(i);
            if (!outdated.contains(entry) && entry.c < minCost) {
                minCost = entry.c;
                resultIndex = i + 1;
            }
        }

        System.out.println(resultIndex);
    }
}

