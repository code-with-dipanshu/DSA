package RECURSION;

import java.util.ArrayList;

public class processUnprocess {

    static void Combinatis(String p ,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        Combinatis(p+ch, up.substring(1));
        Combinatis(p, up.substring(1));
    }
    
    static ArrayList<String> subseq(String p ,String up){
        if (up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            //list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseq(p+ch, up.substring(1));
        ArrayList<String> right = subseq(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        
        String s = "abc";
        System.out.println(subseq("", s));
        //Combinatis("", s);
    }
}
