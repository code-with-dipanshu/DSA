package RECURSION;

public class print {



    static void printN (int arr[], int idx){
           
            if(arr.length == idx){
                return ;
            }
            System.out.println(arr[idx]);
           
            printN(arr, idx + 1);
        }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        printN(arr, 0);

        

    }
}
