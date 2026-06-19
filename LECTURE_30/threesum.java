package LECTURE_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
    static List<List<Integer>> threrSum(int arr[]) {
        List<List<Integer>> nums = new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                if (arr[i] + arr[l] + arr[r] == 0) {

                    List<Integer> temp = new ArrayList<>();

                    temp.add(arr[i]);
                    temp.add(arr[l]);
                    temp.add(arr[r]);
                    nums.add(temp);
                    l++;
                    r--;
                    
                    while(l<r && arr[l]==arr[l+1]){
                        l++;

                    }

                    while(l<r && arr[r]==arr[r-1]){
                        r--;

                    }


                } else if (arr[i] + arr[l] + arr[r] < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4 };
        List<List<Integer>> nums = threrSum(arr);
        System.out.println(nums);

    }

}
