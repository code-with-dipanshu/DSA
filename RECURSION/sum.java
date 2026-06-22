package RECURSION;

public class sum {

    static int Sumofarray(int arr[], int i) {
        if (arr.length - 1 == i) {
            return arr[i];
        }
        int ans = arr[i] + Sumofarray(arr, i + 1);

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 , 5};
        System.out.println(Sumofarray(arr, 0));

    }
}
