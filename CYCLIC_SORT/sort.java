package CYCLIC_SORT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sort {

    public static void CyclicSort(int arr[]) {

        int i = 0;
        while (i < arr.length) {

            int position = arr[i] - 1;
            if (arr[i] != arr[position]) {
                int temp = arr[i];
                arr[i] = arr[position];
                arr[position] = temp;
            } else {
                i++;
            }
        }

    }
    //leetcode missing number

    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length ) {

            int position = nums[i] - 1;
            if (nums[i] != nums[position]) {
                int temp = nums[i];
                nums[i] = nums[position];
                nums[position] = temp;
            } 
            else{
                i++;
            }
        }

        for(int j = 0; j < nums.length ; j++){
            if( nums[j] != j){
                return j;
            }
            
        }
        return nums.length;
        
    }
    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while( i < nums.length){
            int posi = nums[i]- 1;

            if (nums[i] != nums[posi]){
                int temp = nums[i];
                nums[i] = nums[posi];
                nums[posi] = temp;
            } 
            else{
                i++;
            }

            
        }

        for(int j = 1 ; j < nums.length ; j++){
            if (nums[j] != j){
                ans.add(j+1);

            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { 3, 5, 2, 1, 4 };
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
