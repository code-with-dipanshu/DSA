public class unique_ele {

    static int unique(int arr[]){
        int xorsum =0 ;
        int n = arr.length;
        for (int i = 0 ; i< n ; i++){
            xorsum= xorsum^arr[i];
        }
        return xorsum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,2,1,4};
        System.out.println(unique(arr));
    }
}
