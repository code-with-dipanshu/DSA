package LECTURE_49;

public class max_one2 {

    static int FirstOcc(int arr[][], int rowidx) {

        int m = arr.length;
        int n = arr[0].length;
        int target = 1;
        int ans = -1;

        if (arr[rowidx][n - 1] == 0) {
            return n ;
        }

        else {

            int low = 0;
            int high = n - 1;
            while (low <= high) {

                int mid = low + (high - low) / 2;
                if (arr[rowidx][mid] == target) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            }

        }

        return ans;
    }

    static int maxOne(int arr[][]) {
        int ans = -1;
        int row = -1;

        for (int i = 0; i < arr.length; i++) {

            int first = arr[0].length - FirstOcc(arr, i);

            if (first > 0 && first > ans) {

                ans = first;
                row = i;
            }
        }
        return row;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 0, 0, 0, 1 },
                { 0, 0, 1, 1 },
                { 0, 1, 1, 1 },
                { 1, 1, 1, 1 }
        };
        System.out.println(maxOne(arr));
    }
}
