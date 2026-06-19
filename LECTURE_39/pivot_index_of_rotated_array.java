package LECTURE_39;



public class pivot_index_of_rotated_array {

    static int index(int arr[]) {
        int low = 0;
        int high = arr.length-1;
        int n = arr.length;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] >= arr[n-1]){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={4,6,7,8,1,2,3};
        System.out.println(index(arr));
    }

}