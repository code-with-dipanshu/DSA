package LECTURE_51;

public class mostFrequentAlphabet {

    static char mostFreq(String s){

        int freq[]= new int[26];
        for (int i = 0 ; i< s .length(); i++){
            char x =s.charAt(i);
            freq[x - 'a']++;

        }


        char ch= ' ';
        int max = -1;
        for (int i= 0; i<26; i++){
            if(freq[i] > max){
                max = freq[i];
                ch = (char)(i + 'a');
            }
        }
        return ch;
    }
        
    public static void main(String[] args) {
        String s = "testcase";
        System.out.println(mostFreq(s));
    }
}
