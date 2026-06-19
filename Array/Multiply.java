public class Multiply {

    public static int[] multiply(int[] arr) {
        int n = arr.length;
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            int element = arr[i] * 10;
            newArray[i] = element;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int newarr[] = multiply(arr);
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }

}
