package RECURSION;

public class one_to_ten {

    static void print(int i){
        
        if(i > 10){
            return;
        }
        print(i+1);
        System.out.println(i);

    }
    
    public static void main(String[] args) {
        
        print(1);
    }
}
