import java.util.Arrays;

public class zerosandOne {

    static void sort0and1(int[] arr) {
        int n = arr.length;
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 1) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,1,0,0,1,0,1};
        sort0and1(arr);
        System.out.println(Arrays.toString(arr));

    }
}