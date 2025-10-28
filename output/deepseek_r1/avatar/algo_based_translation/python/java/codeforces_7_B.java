
import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] initParams = scanner.nextLine().split(" ");
        int commandCount = Integer.parseInt(initParams[0]);
        int memorySize = Integer.parseInt(initParams[1]);

        ArrayList<Integer> memory = new ArrayList<>();
        for (int i = 0; i < memorySize; i++) {
            memory.add(0);
        }
        int currentId = 1;

        for (int i = 0; i < commandCount; i++) {
            String[] command = scanner.nextLine().split(" ");
            switch (command[0]) {
                case "alloc":
                    int blockSize = Integer.parseInt(command[1]);
                    boolean allocated = false;
                    int freeCounter = 0;

                    for (int j = 0; j < memorySize; j++) {
                        if (memory.get(j) == 0) {
                            freeCounter++;
                            if (freeCounter == blockSize) {
                                int startIndex = j - blockSize + 1;
                                for (int k = startIndex; k <= j; k++) {
                                    memory.set(k, currentId);
                                }
                                System.out.println(currentId);
                                currentId++;
                                allocated = true;
                                break;
                            }
                        } else {
                            freeCounter = 0;
                        }
                    }
                    if (!allocated) {
                        System.out.println("NULL");
                    }
                    break;

                case "erase":
                    int targetId = Integer.parseInt(command[1]);
                    if (targetId == 0 || !memory.contains(targetId)) {
                        System.out.println("ILLEGAL_ERASE_ARGUMENT");
                    } else {
                        for (int j = 0; j < memorySize; j++) {
                            if (memory.get(j).equals(targetId)) {
                                memory.set(j, 0);
                            }
                        }
                    }
                    break;

                case "defragment":
                    ArrayList<Integer> compacted = new ArrayList<>();
                    int zeroCount = 0;
                    for (int block : memory) {
                        if (block != 0) {
                            compacted.add(block);
                        } else {
                            zeroCount++;
                        }
                    }
                    for (int j = 0; j < zeroCount; j++) {
                        compacted.add(0);
                    }
                    memory = compacted;
                    break;
            }
        }
        scanner.close();
    }
}

