public class mulBy10 {

    public static void multiply(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * 10;

        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        multiply(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}