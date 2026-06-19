package Unbound_search;

public class search {

    static int FindElemt(int arr[], int target) {

        if (arr[0] == target) {
            return 0;
        }

        int i = 1;
        while (arr[i] <= target) {
            i = i * 2;
        }

        if (arr[i] > target) {
            int start = i / 2;
            int end = i;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, 5, 6, 78, 99, 132, 199 };

        System.out.println(FindElemt(arr, 199));

    }
}
