/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Producer
 */
public class GroceryListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> groceryList = new ArrayList();
        groceryList.add("Milk");
        groceryList.add("Cheese");
        groceryList.add("Bread");
        System.out.println("GroceryList items: "+groceryList);
        Collection fruits = Arrays.asList("Apples","Bananas","Oranges","Grapes");

        System.out.println("Add Fruits to GroceryList!");
        groceryList.addAll(fruits);
        System.out.println("GroceryList items: "+groceryList);

        System.out.println("Remove Bananas(if present) from GroceryList!");
        if(groceryList.contains("Bananas"))
        {
            groceryList.remove("Bananas");
        }
        System.out.println("GroceryList items: "+groceryList);

    }
    
}
