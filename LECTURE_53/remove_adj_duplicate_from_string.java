package LECTURE_53;

public class remove_adj_duplicate_from_string {


    static String answer(String s){


        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i< s.length(); i++){

            char ch = s.charAt(i);
            int n = ans.length() -1;
            if(ans.length() > 0 &&  ch == ans.charAt(n)   ){
                ans.deleteCharAt(n);
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    

    public static void main(String[] args) {
        String s = "abbaca";
        

        System.out.println(answer(s));
    }
}
