public class TwoD_Array {

    static void main(){
        int arr[][]= new int [3][3];

        System.out.println(arr);

        int brr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i = 0 ; i< brr.length;i++){
            for(int j =0;j<brr[i].length;j++){

                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
