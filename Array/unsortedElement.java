public class unsortedElement{
    static int Unsorted(int arr[]){
        int ans= -1;
        for(int i = 0 ; i < arr.length-1;i++){
            if( arr[i+1]>  arr[i]){
                continue;
            }
            else{
                ans=arr[i+1];
                break;
            }
        }


        return ans;
    }
    public static void  main(String[] args) {
        int arr[]={11,13,20,25,2,1} ;       
        System.out.println("ANSWER: " +Unsorted(arr));
        // System.out.println(Unsorted(arr));
    }

}