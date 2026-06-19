import java.util.ArrayList;
import java.util.List;

public class spiral{

    static List<Integer> spiralMatrix(int[][] arr){
        List<Integer> ans = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        int startingRow = 0;
        int endingrow = m-1;
        int startCol = 0;
        int endCol= n-1;

        while(startingRow <= endingrow && startCol <= endCol){
            //row wise left to right
            for(int col = startCol; col <=endCol; col++){
                ans.add(arr[startingRow][col]);
            }
            startingRow++;
            
            //col wise top to bottom
            for(int row = startingRow;  row <= endingrow; row++){
                ans.add(arr[row][endCol]);
            }
            endCol--;


            //row wise right to left
            for(int col = endCol; col>= startCol; col--){

                ans.add(arr[endingrow][col]);
            }
            endingrow--; 
            
            // col wise bottom to top
            for(int row = endingrow; row>= startingRow; row--){
                ans.add(arr[row][startCol]);

            }
            startCol++;
        }



        return ans;


        
    }

    public static void main(String[] args) {
         int brr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(spiralMatrix(brr));
    }
}