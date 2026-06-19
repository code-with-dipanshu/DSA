
package LECTURE_28;

public class shiftaRRRBY1 {

    static void shift(int arr[]) {

        int n = arr.length;
        int temp = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            arr[i+1] = arr[i];
        }
        arr[0] = temp;

    }

    public static void main(String[] args) {
        int arr[]={3,4,5,6,7};
        shift(arr);

        
        for(int i :arr){
        System.out.println(i);

    }
    }

}