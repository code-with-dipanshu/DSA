import java.util.Arrays;

public class aggressive_cows {
    static boolean isValidMid(int stalls[], int k, int mid) {

        int cowsCount = 1;
        int lastPosition = 0;
        for (int i = 1; i < stalls.length; i++) {

            if (stalls[i] - stalls[lastPosition] >= mid) {
                cowsCount++;
                lastPosition = i;

            }
            if (cowsCount == k) {
                return true;
            }

        }
        return false;
    }

    public static int aggressiveCows(int[] stalls, int k) {

        Arrays.sort(stalls);

        int ans = -1;
        int low = 0;
        int high = stalls[stalls.length - 1] - stalls[0];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isValidMid(stalls, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int stalls[] = { 2, 12, 11, 3, 26, 7 };
        int k = 5;
        System.out.println(aggressiveCows(stalls, k));

    }
}
