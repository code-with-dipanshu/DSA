package LECTURE_48;

public class bs1 {

    static boolean PresentElement(int arr[][], int target){
        int m = arr.length;
        int n = arr[0].length;

        int totalElement = m*n;

        int low = 0;
        int high = totalElement - 1;
         while(low <= high){
            int mid = low + (high-low)/2;
            int rowidx = mid /n;
            int colIdx = mid %n;

            if(arr[rowidx][colIdx] == target){
                return true;
            }
            else if(arr[rowidx][colIdx] <= target){
                low= mid + 1;
            }
            else{
                high = mid - 1;
            }
         }

        
        return false;

    }
    public static void main(String[] args) {
        int arr[][]={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        System.out.println(PresentElement(arr, 16));
        
    }
}
