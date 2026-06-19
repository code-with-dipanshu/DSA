package LECTURE_37;

public class uppr_lowerbound {

    static int LowerBound(int arr[],int target){
        int n = arr.length;
        int ans = n;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low +(high-low)/2;
            if (arr[mid] >= target){
                ans= mid;
                high = mid-1;

            }
            else{
                low = mid +1;
            }

        }

        return ans;

    }


    static int UpperBound(int arr[], int target){
        int n = arr.length;
        int ans = n;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = start +(end - start)/2;
            if (arr[mid] <= target){
                start = mid +1;
            }
            else{
                ans= mid;
                end = mid-1;
            }


        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={1,1,2,2,2,2,3,3};
        System.out.println(LowerBound(arr, 2));
        System.out.println(UpperBound(arr, 2));
    }
}
