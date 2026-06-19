

public class rotate2D {
    static void rotate(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {

            int l = 0;
            int r = n - 1;
            while (l <= r) {
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;

                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int brr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        rotate(brr, 3);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
