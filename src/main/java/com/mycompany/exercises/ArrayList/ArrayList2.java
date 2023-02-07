/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercises.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author crist
 */
public class ArrayList2 {
    public static void main(String[] args) {
        //13. Write a Java program to compare two array lists
        ArrayList<String> letters1 = new ArrayList<>();
        letters1.add("A");
        letters1.add("B");
        letters1.add("C");
        letters1.add("D");
        letters1.add("E");
        
        ArrayList<String> letters2 = new ArrayList<>();
        letters2.add("A");
        letters2.add("E");
        letters2.add("I");
        letters2.add("O");
        letters2.add("U");
        
        System.out.println("ArrayList1 -> "+letters1);
        System.out.println("ArrayList2 -> "+letters2);
        
            //Storing comparison output in a new ArrayList
        ArrayList<String> c3 = new ArrayList<>();
        for(String letter: letters1)
            c3.add(letters2.contains(letter) ? "Yes" : "No");
        System.out.println(c3);
        
        //14. Write a Java program of swap two elements in an array list.
        System.out.println("\n"+letters1.get(0)+ " swap with "+letters1.get(4));
        Collections.swap(letters1, 0, 4);
        System.out.println("ArrayList1 swap -> "+letters1);
        
        //15. Write a Java program to join two array lists.
        ArrayList<String> allLetters = new ArrayList<>();
        allLetters.addAll(letters1);
        allLetters.addAll(letters2);
        System.out.println("ArrayList joining both ArrayList-> "+allLetters);
    
        //16. Write a Java program to clone an array list to another array list.
        ArrayList<String> arrayListCloned = (ArrayList<String>)allLetters.clone();
        System.out.println("ArrayList cloned -> "+arrayListCloned);
        
        //17. Write a Java program to empty an array list
        arrayListCloned.clear();
        System.out.println(arrayListCloned);
        
        //18. Write a Java program to test an array list is empty or not.
        if(arrayListCloned.isEmpty()){
            System.out.println("ArrayList is empty"+ arrayListCloned);
        }else{
            System.out.println("ArrayList is NOT empty"+ arrayListCloned);
        }
        
        //19. Write a Java program to trim the capacity of an array list the current list size. 
        System.out.println("\nArrayList2 -> "+letters2);
        letters2.trimToSize();
        System.out.println("ArrayList trimmed ->"+ letters2);
        
        //20. Write a Java program to increase the size of an array list
        letters2.ensureCapacity(7);
        letters2.add("X");
        letters2.add("Y");
        System.out.println("\nAfter .ensureCapacity(7) and adding 'X''Y'");
        System.out.println(letters2);
    
        //21. Write a Java program to replace the second element of a ArrayList with the specified element
        System.out.println("\nAfter replacing 'X' to 'Z'");
        letters2.set(5, "Z");
        System.out.println(letters2);
        
        //22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
        for(int i=0;i<letters2.size();i++){
            System.out.println(letters2.get(i));
        }
        
        
    }
}
