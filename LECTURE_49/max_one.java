package LECTURE_49;

public class max_one {

    static int MaxOne(int arr[][]) {
        int ans = -1;
        int row = -1;
        int m = arr.length;

        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            if (sum > ans) {
                ans = sum;
                row = i;
            }
        }

        return row;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 1, 1 },
                { 0, 1, 1 },
                { 0, 0, 1 }
        };
        System.out.println(MaxOne(arr));
    }
}
