package LECTURE_28;

import java.util.HashMap;
import java.util.Map;

public class mode {

    static int mostOccured(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);

        }
        int ans = -1;
        int max = 0;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ans = entry.getKey();
            }

        }
        return ans;
    }
    //minimun element occured in the array 
    static int minn(int[] arr){
        HashMap<Integer,Integer> freqq =  new HashMap<>();

        for (int i : arr){
            freqq.put(i,freqq.getOrDefault(i,0)+1);
        }
        int min =Integer.MAX_VALUE;
        int minfreqelement =0 ;
        for(Map.Entry<Integer,Integer> entry : freqq.entrySet()){
            if(entry.getValue() < min){
                min = entry.getValue();
                minfreqelement=entry.getKey();

            }
        }

        


        return minfreqelement;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,3};

        System.out.println("maximun occured element in an array: " + mostOccured(arr));
        System.out.println("minimun occured element in an array: " + minn(arr));
    }
}
