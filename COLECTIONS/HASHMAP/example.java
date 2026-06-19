package COLECTIONS.HASHMAP;

import java.util.*;

public class example {
    public static void main(String[] args) {

        Map<String,Integer> mp = new HashMap<>();

        mp.put("Dipanshu", 38);
        mp.put("Ritansha", 40);
        mp.put("Lohita", 35);
        mp.put("Advait", 49);
        mp.put("Ridhima ", 56);

        //System.out.println(mp);
        ///iteratiion 
        for(Map.Entry<String , Integer> entry : mp.entrySet() ){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
        
        //counting frequensies
        int arr[]= {1,2,1,3,2,1,2,3,3,1};
        HashMap<Integer,Integer> freq = new HashMap<>();

        for (int i : arr){
            if(freq.containsKey(i)){
                freq.put(i,freq.get(i)+1);  
            }
            else{
                freq.put(i,1);
            }
        }
        for (int i : arr){
            freq.put(i,freq.getOrDefault(i, 0)+1);
        }

        System.out.println(freq);
        for(Map.Entry<Integer,Integer> frequency : freq.entrySet()){
            System.out.println(frequency.getKey()+ "->" + frequency.getValue());

        }
        //to find which number comes maximun number of times
        int max = 0;
        int ans= 0;

        for(Map.Entry<Integer,Integer> count : freq.entrySet()){
            if(count.getValue() > max){
                max= count.getValue();
                ans = count.getKey();
                
            }
        }
        System.out.println("maximun number present in the array "+ ans);



    }
}
