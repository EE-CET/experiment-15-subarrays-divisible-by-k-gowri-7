
import java.util.Scanner;

public class SubarraysDivByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] freq = new int[k];
        freq[0] = 1;

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            int rem = sum % k;
            if (rem < 0) {
                rem += k;
            }

            count += freq[rem];
            freq[rem]++;
        }

        System.out.println(count);
    }
}
