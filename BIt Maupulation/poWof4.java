public class poWof4 {

    public static boolean Powerof4(int n){
        int count = 0;
        while(n!=0){
            if((n&1) != 0){
                count++;
            }
            n=n>>2;
        }        
        if(count==1) return true;

        return false;
    }
    //wrong
    

    public static void main(String[] args) {
        System.out.println(Powerof4(108));

    }

}
