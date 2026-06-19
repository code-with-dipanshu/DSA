import java.util.Scanner;
import java.math.BigInteger;


public class input {
    static void main() {
        
        Scanner input = new Scanner(System.in);

        String Name = input.nextLine();
        int firstNum = input.nextInt();
        BigInteger nextBigInteger = input.nextBigInteger();
        System.out.println("numebr: " + firstNum );
        System.out.println("bignumebr: " + nextBigInteger );
        System.out.println("NAme: " + Name );

        
        input.close();
        

    }
}
