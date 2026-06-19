package LECTURE_47;

public class NonDuplicate {
    static int non_duplicate(int arr[]){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;

        while(low <= high ){

            int mid = low + (high - low)/2;
            int currentValue = arr[mid];
            int prevValue = -1;

            if(mid > 0){
                prevValue=arr[mid-1];
            }
            int nextValue =-1;
            if(mid < arr.length-1){
                nextValue = arr[mid +1];
            }
            if(currentValue != prevValue && currentValue!=nextValue){
                return currentValue;
            }

            if (currentValue== prevValue && currentValue!=nextValue){
                if((mid -1) % 2 ==0){
                    ans = mid;
                    low = mid +1;
                }
                else{
                    high =mid -1;
                }
            }
            if(currentValue != prevValue && currentValue==nextValue){
                if((mid % 2) != 0){
                    high = mid -1;
                    ans  = mid;

                }
                else{
                    low = mid +1;
                }
            }



        }
    
    
        return ans;    
    
    }
    

    public static void main(String[] args) {
        int arr[]= {10,10,20,20,30,30,40,40,50,70,70};
        System.out.println(non_duplicate(arr));

    }
}
