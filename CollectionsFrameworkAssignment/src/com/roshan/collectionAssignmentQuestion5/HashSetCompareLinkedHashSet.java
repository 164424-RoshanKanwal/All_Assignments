package com.roshan.collectionAssignmentQuestion5;



import java.util.HashSet;
import java.util.LinkedHashSet;


public class HashSetCompareLinkedHashSet {
    
    public static void main(String[] args) {
        
        HashSet<String> hashSet = new HashSet<String>();

hashSet.add("Roshan");
        hashSet.add("kanwal");
        hashSet.add("R");
        hashSet.add("K");//insertion order is not maintained
        hashSet.add("O");
        hashSet.add("A");
        
        System.out.println(hashSet);
        System.out.println();
        
        LinkedHashSet<String> linkHashSet = new LinkedHashSet<String>();
        linkHashSet.add("Roshan");
        linkHashSet.add("kanwal");
        linkHashSet.add("R");
        linkHashSet.add("K");
        linkHashSet.add("O");//insertion order is maintained
        linkHashSet.add("A");
        
        System.out.println(linkHashSet);
    }
}
