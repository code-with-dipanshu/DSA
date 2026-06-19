package LECTURE_30;

import java.util.HashMap;

public class removeDuplicate {

    static int remove(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i= 0;i < arr.length ; i++){
            map.put(arr[i],i);
        }

        return map.size();
    }

    static int alternate(int arr[]){

        int i = 0 ;
        int j =1;
        while(j< arr.length){
            if(arr[i]== arr[j]){
                j++;
            }
            else{

                i++;
                arr[i]=arr[j];
                j++;
            }


        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,2,3,3,4};
        System.out.println(remove(arr));
        System.out.println(alternate(arr));
    }
}
