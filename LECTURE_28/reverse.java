
package LECTURE_28;

public class reverse {

    static void rev(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        while (l < r) {
            arr[l] ^= arr[r];
            arr[r] ^= arr[l];
            arr[l] ^= arr[r];
            l++;
            r--;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1000, 3, 4, 5, 6 };

        rev(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
