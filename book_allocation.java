public class book_allocation {
    static boolean ValidMid(int [] arr, int k , int mid){

        int studentcnt = 1;
        int books = 0;
        for (int i = 0 ; i< arr.length ; i++){
            books = books +arr[i];
            if(books > mid){
                studentcnt++;
                books = arr[i];
                
            }
            if (studentcnt > k || arr[i] > mid){
                return false;
            }
        }
        return true;
    }
    static int BookAllocated(int[] arr, int k ){
        int ans = -1;

        int low = 1;
        int n = arr.length;
        int sum = 0;
        for (int i = 0 ; i< n ; i++){
            sum+=arr[i];
        }
        int high = sum;

        while(low <= high){
            int mid = low +(high- low)/ 2;
             if(ValidMid(arr, k ,mid)){
                ans = mid;
                high = mid -1;

             }
             else{
                low = mid +1;
             }
        }
        return ans;
    }
    public static void main(String[] args) {
        int k = 2;
        int arr[]={10,20,30,40,50};
        System.out.println(BookAllocated(arr, k));
    }
}
