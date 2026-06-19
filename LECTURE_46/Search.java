package LECTURE_46;
//Search in Nearly Sorted Array

public class Search {
    static int Search_in_Nearly_Sorted_Array(int[] arr, int k) {
        int low = 0;
        int high = arr.length -1;
         while(low <= high){
            int mid = low + (high - low)/2;

            if (arr[mid]== k){
                return mid;

            }
            if (mid + 1 < arr.length && arr[mid+1]== k){
                return mid+1;

            }
            if (mid -1 >= 0 && arr[mid-1]== k){
                return mid-1;
            }
            if(k > arr[mid]){
                low = mid+2;

            }
            else{
                high = mid - 2;
            }
         } 

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 5, 7, 8 };

        int k = 7;
        System.out.println(Search_in_Nearly_Sorted_Array(arr, k));
    }

}
