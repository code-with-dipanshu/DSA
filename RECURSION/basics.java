package RECURSION;

public class basics {

    static void printdigit(int n){

        if (n==0){
            return;
        }
    
        printdigit(n/10);
        System.out.println(n%10);
    }

    public static void main(String[] args) {
        

        int n = 143;
        printdigit(n);

    }
    
}
