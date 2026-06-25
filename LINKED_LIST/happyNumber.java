package LINKED_LIST;

import LINKED_LIST.ll.Node;

public class happyNumber {
    
    //https://leetcode.com/problems/happy-number/description/
    
    static boolean isHappyNumber(int n){
        
        int slow = n;
        int fast = n;

        while(true){
            slow = Square(slow);
            fast = Square(Square(fast));
            
            if (slow == fast){
                break;
            }
        }


        return slow==1;


    }
    private static int Square(int n){

        int ans = 0;
        while ( n != 0){
            int rem = n % 10;
            ans = ans +  rem * rem;
            n = n /10;

        }
        return ans;
    }
    
   

    public static void main(String[] args) {
        int n = 91;

        System.out.println(isHappyNumber(n));
        

    }
}
