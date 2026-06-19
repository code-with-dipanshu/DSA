public class shiftByOne {

    static void ShiftBy1(int arr[]) {
        int n = arr.length-1;
        int temp = arr[n];
        for (int i = n; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 ,20,22 };
        ShiftBy1(arr);
        for (int i : arr) {
            System.out.print(i +" ");
        }
        

    }
}
