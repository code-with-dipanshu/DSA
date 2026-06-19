
package LECTURE_33;
import java.util.ArrayList;
import java.util.List;

public class wave{

static List<Integer> Waveprnt(int [][] arr, int m , int n){
    List<Integer> result = new ArrayList<>();

    for(int col = 0 ; col < n; col++){
        if (col % 2 == 0){
            for(int row = 0 ; row < m ; row++){
                result.add(arr[row][col]);
            }

        }
        else{
            for(int row = n-1 ; row>=0;row--){
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

        System.out.println(Waveprnt(brr,3,3));
    }

}