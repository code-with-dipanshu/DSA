package LECTURE_30;

public class pivot {

    static int FindPivot(int arr[]){
        int n = arr.length;
        int leftSum[]= new int [n];
        int rightsum[]= new int[n];

        leftSum[0]= arr[0];
        for (int i = 1 ;i< n; i++){
            leftSum[i]= leftSum[i-1]+ arr[i];
        }

        rightsum[n-1] = arr[n-1];
        for(int i = n-2 ; i>=0 ;i--){
            rightsum[i]= rightsum[i+1]+arr[i];
        }

        for (int i = 0 ; i< n ; i++){
            if(leftSum[i]==rightsum[i]){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {1,3,7,6,5,6};
        System.out.println(FindPivot(arr));
        
    }
}
