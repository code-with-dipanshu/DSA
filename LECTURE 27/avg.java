

public class avg {

    public static int avgg(int[] brr) {
        int sum = 0;
        int n = brr.length;
        for (int i = 0; i < n; i++) {
            sum += brr[i];
        }
        return sum / n;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3 };
        System.out.println(avgg(arr));

    }
}