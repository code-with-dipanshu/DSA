public class missing_number {

    static int alternate(int arr[]){
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0 ; i <arr.length; i++){
            xor1 = xor1^arr[i];
        }
        for (int i = 1 ; i <=arr.length+1; i++){
            xor2 = xor2^i;
        }
        return xor1^xor2;
    }


    static int missing(int arr[]){
        int ans = 0;
        
        int n = arr.length;
        int sum = ((n+1) * (n+2))/2;
        for(int i = 0 ; i< n; i++){
            ans+=arr[i];

        }

        return sum - ans;


    }
    public static void main(String[] args) {
        int arr[]= {1,2,4,5,6};
        System.out.println(missing(arr));
        System.out.println(alternate(arr));
    }
    
}
