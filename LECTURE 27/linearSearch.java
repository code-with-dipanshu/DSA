public class linearSearch {

    static int indexOf(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, 3, 1, 6, 7 };
        System.out.println(indexOf(arr, 6));
    }
}
