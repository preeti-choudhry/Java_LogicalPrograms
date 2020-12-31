package main.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Producer
 */
public class SortAndSearchAList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(30,1,5,3,2,8,13,21,34,3);
        System.out.println("Input List: "+list1);

        Collections.sort(list1);
        for(Integer x: list1) System.out.println(" "+x);

        int index = Collections.binarySearch(list1, 21);
        System.out.println("Position of 21: "+ index);


    }
    
}