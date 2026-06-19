public class firstunsorted {
    static int unsorted(int arr[]) {

        int n = arr.length-1;
        for (int i = 0; i < n; i++) {
            if (arr[i + 1] > arr[i]) {
                continue;

            } else {
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 5, 8, 9 };
        System.out.println(unsorted(arr));
    }

}
