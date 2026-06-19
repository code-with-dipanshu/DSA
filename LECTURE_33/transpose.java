
package LECTURE_33;
import java.util.Arrays;

public class transpose {

    static int[][] transss(int[][] arr) {
        int[][] matrix = new int [arr[0].length][arr.length];
        


        for (int i = 0 ; i< arr.length; i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                matrix[j][i] = arr[i][j];
                
            }
        }
        return matrix;

    }

    public static void main(String[] args) {
        int brr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int arr1[][]= transss(brr);
        System.out.println((Arrays.deepToString(arr1)));

    }
}
