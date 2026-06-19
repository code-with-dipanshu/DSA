public class array {

    static void main() {
        int[] arr = { 2, 4, -10, 33, 12, 6 };
        int max = arr[0];

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println("maximum value is: " + max);

    }
}
