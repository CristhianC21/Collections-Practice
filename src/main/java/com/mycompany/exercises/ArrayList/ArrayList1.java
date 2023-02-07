/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercises.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author crist
 */
public class ArrayList1 {
    public static void main(String[] args) {
        //1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Coffee");
        colors.add("Brown");
        colors.add("Cyan");
        
        System.out.println(colors);
        
        //2. Write a Java program to iterate through all elements in a array list. 
        Iterator iterator = colors.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        //3.Write a Java program to insert an element into the array list at the first position. 
        colors.add(0, "Black");
        
        //4. Write a Java program to retrieve an element (at a specified index) from a given array list
        colors.get(4);
        
        //5. Write a Java program to update specific array element by given element.
        colors.set(3,"White");
        
        //6. Write a Java program to remove the third element from a array list.
        colors.remove(3);
        
        //7. Write a Java program to search an element in a array list.
        if(colors.contains("Cyan")){
            System.out.println("Cyan is in ArrayList");
        }else{
            System.out.println("Cyan is NOT in ArrayList");
        }
    
        //8. Write a Java program to sort a given array list
        Collections.sort(colors);
        System.out.println("ArrayList is sorted -> "+colors);
        
        //9. Write a Java program to copy one array list into another.
            //METHOD 1
 //       List<String> newColorsList = new ArrayList<>(colors);
            //METHOD 2
//        List<String> colorsList = newf ArrayList<>();
//        colorsList.addAll(colors);
            //METHOD 3
        List<String> colorsCopy = new ArrayList<>(); //ArrayList destination has to have the same elements
        colorsCopy.add("A");
        colorsCopy.add("B");
        colorsCopy.add("C");
        colorsCopy.add("D");
        colorsCopy.add("E");
        Collections.copy(colorsCopy, colors);
        System.out.println("Colors copy -> "+colorsCopy);
        
        //10. Write a Java program to shuffle elements in a array list.
        Collections.shuffle(colors);
        System.out.println("ArrayList shuffled -> "+colors);
    
        
        //11. Write a Java program to reverse elements in a array list.
        Collections.sort(colors);
        Collections.reverse(colors);
        System.out.println("ArrayList reverse order -> "+ colors);
        
        //12. Write a Java program to extract a portion of a array list.
        List<String> firstColors = colors.subList(0, 2);
        System.out.println("ArrayList extract -> "+ firstColors);
       
        
     }
}
