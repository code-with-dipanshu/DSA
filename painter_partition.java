public class painter_partition {

    static boolean validMid(int arr[], int k , int mid){
        int painter = 1;
        int boards = 0;

        for(int i = 0; i < arr.length; i++){
            boards = boards + arr[i];

            if(boards >  mid){
                painter++;
                boards= arr[i];
            }
            if (arr[i] > mid || painter > k){
                return false;
            }
        }

        return true;
    }
    static int partition(int arr[], int k ){
        int ans = 0;

        int low = 0;
        int sum = 0;
        for (int i = 0;i < arr.length ;i++      ){
            sum+=arr[i];
        }
        int high = sum;
        while(low <= high ){
            int mid = low + (high-low)/2;
            if(validMid(arr,k,mid)){
                ans = mid;
                high= mid-1;

            }
            else{
                low =mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
        int k = 3;
        int[] boards = {5, 10 , 30 , 20, 15};
        System.out.println(partition(boards, k));


    }
}
