package LECTURE_30;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {

    static int[] two_sum(int arr[], int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement),i};
            }
            map.put(arr[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 9, 11 };
        int result[] = two_sum(arr, 9);
        System.out.println(Arrays.toString(result));

    }

}
