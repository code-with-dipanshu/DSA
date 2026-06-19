public class maximun {

    static int maxiunFromArray(int arr[]){

        int max = arr[0];
        int n = arr.length;
        for (int i = 1;i<n;i++){
            if (arr[i]> max){
                max= arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={4,77,5544,8977,334} ;
        System.out.println(maxiunFromArray(arr)); 
    
    }
}
