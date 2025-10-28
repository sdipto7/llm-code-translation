
import java.util.*;

public class s575946485 {

    public static int processNumbers() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            a.add(scanner.nextInt());
        }

        Map<Integer, Integer> dic = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            String numberStr = a.get(i).toString();
            char lastChar = numberStr.charAt(numberStr.length() - 1);
            if (lastChar == '0') {
                dic.put(i, 0);
            } else {
                dic.put(i, Character.getNumericValue(lastChar) - 10);
            }
        }

        int minNum = Collections.min(dic.entrySet(), Map.Entry.comparingByValue()).getKey();

        int aSum = a.stream().mapToInt(Integer::intValue).sum();
        
        dic.remove(minNum);

        int dicSum = dic.values().stream().mapToInt(Math::abs).sum();

        return dicSum + aSum;
    }

    public static void main(String[] args) {
        System.out.println(processNumbers());
    }
}

