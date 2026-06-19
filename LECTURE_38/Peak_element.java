package LECTURE_38;

public class Peak_element {
    static int peak(int arr[]){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] >= arr[mid +1]){
                ans =mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]= {0 ,2, 3, 5, 1};
        System.out.println(peak(arr));
    }
    
}
