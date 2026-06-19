
package LECTURE_33;
import java.util.ArrayList;
import java.util.List;

public class waveRow {

   static List<Integer> WaveRows(int arr[][], int m , int n){

        List<Integer> result = new ArrayList<>();
        for(int row = 0 ; row < m ; row++){

            if(row%2==0){
                for(int col = 0 ; col< n ; col++){
                    result.add(arr[row][col]);
                }
            }
            else{
               for(int col = n-1 ; col>=0 ; col--){
                    result.add(arr[row][col]);
                } 
            }
        }
        return result;

   } 
    public static void main(String[] args) {
        

        int brr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(WaveRows(brr,3,3));
   
    }
}
