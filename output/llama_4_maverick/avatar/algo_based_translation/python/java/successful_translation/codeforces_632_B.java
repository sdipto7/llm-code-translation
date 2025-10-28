
import java.util.Scanner;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] values = scanner.nextLine().split(" ");
        String[] characters = scanner.nextLine().split("");
        int n = values.length;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(values[i]);
        }
        System.out.println(Bob_sMaxStrength(nums, characters));
    }

    public static int Bob_sMaxStrength(int[] nums, String[] characters) {
        int pScore = 0, sScore = 0, pMaxScore = 0, sMaxScore = 0;
        for (int i = 0; i < nums.length; i++) {
            if (characters[i].equals("B")) {
                pScore += nums[i];
                sScore += nums[i];
            }
        }
        pMaxScore = pScore;
        sMaxScore = sScore;
        for (int i = 0; i < nums.length; i++) {
            if (characters[i].equals("A")) {
                pScore += nums[i];
            } else {
                pScore -= nums[i];
            }
            if (pScore > pMaxScore) {
                pMaxScore = pScore;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (characters[i].equals("A")) {
                sScore += nums[i];
            } else {
                sScore -= nums[i];
            }
            if (sScore > sMaxScore) {
                sMaxScore = sScore;
            }
        }
        return Math.max(pMaxScore, sMaxScore);
    }
}

