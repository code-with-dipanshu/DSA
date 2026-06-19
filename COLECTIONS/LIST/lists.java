package COLECTIONS.LIST;


import java.util.ArrayList;


public class lists {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        // ArrayList<Integer> newlist = new ArrayList<>();
        // newlist = (ArrayList<Integer>)list.clone();

        //new way to clone
        ArrayList<Integer> newlist = new ArrayList<>(list);
       
        newlist.add(50);
        System.out.println(newlist);


    }

}