import java.util.Scanner;

public class BitOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(7&6);
        System.out.println("Enter a numebr");
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
            if ((n&1) != 0){
                count++;
            }
            n= n >> 1;
        }
        System.out.println(count);
        if (count ==1) {
            System.out.println("power of 2");
        }
        else{
            System.out.println("not a power of 2");
        }
        sc.close();
    }

}
