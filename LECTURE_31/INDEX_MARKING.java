package LECTURE_31;

import java.util.ArrayList;
import java.util.List;

public class INDEX_MARKING {
    static List<Integer> findDisappeared(int arr[]) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0 ; i < arr.length; i++){


            // value nikal lo aur uski position decide karo aaray me aur fir uske indx ko mark karo
            int value = Math.abs(arr[i]);
            int position = value-1;

            if (arr[position]> 0){
                arr[position]*= -1;

            }
        }
        for (int i = 0 ; i< arr.length ;i++){
            if (arr[i] > 0){
                ans.add(i+1);

            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 4, 5, 2, 2 };
        System.out.println(findDisappeared(arr));
    }
}
