package ArrayList;

import java.util.*;

public class sort {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Zope");
        list.add("Roshan");

        System.out.println("Original list :: " + list);
        Collections.sort(list);
        System.out.println("Sorted list :: " + list);
        
    }
}
