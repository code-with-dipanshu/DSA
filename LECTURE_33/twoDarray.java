package LECTURE_33;
import java.util.ArrayList;
import java.util.List;

public class twoDarray {

    static List<Integer> add(int[][] arr) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];

            }
            ans.add(sum);
        }

        return ans;
    }

    public static void main(String[] args) {

        int brr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(add(brr));
    }
}