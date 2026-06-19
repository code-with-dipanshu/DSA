package LECTURE_48;

public class bs2 {
    static boolean ElementPresent(int arr[][], int k){
        int Totalrows = arr.length;
        int totalcol = arr[0].length;


        int row = 0;
        int col = totalcol - 1;
        while(row < Totalrows && col >= 0){
            if(arr[row][col]==k){
                return true;

            }
            else if(arr[row][col] > k){
                col--;
            }

            else{
                row++;
            }


        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][]={
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22}
        };
        int k = 22;
        System.out.println(ElementPresent(arr, k));
    }
    
}
