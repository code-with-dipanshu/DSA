package LECTURE_30;

import java.util.HashMap;

public class FindFirstRepeat {
    static int repeat(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);

        }
        for (int ans: arr){
            if(map.get(ans)>1){
                return ans;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]= { 1,2,3,4,2,3};
        System.out.println(repeat(arr));
    }

}
