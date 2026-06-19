package LECTURE_32;

public class kadanesAlgo {

    static int algo(int arr[]) {
        int n = arr.length;

        int sum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            maxsum = Math.max(maxsum, sum);
            if (sum < 0) {
                sum = 0;

            }

        }
        return maxsum;

    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(algo(arr));

    }
}
