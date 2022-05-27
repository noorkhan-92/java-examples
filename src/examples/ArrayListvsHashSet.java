package examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListvsHashSet {
    
    public ArrayListvsHashSet(){
     
        List<Integer> al = new ArrayList<>();
        Set<Integer> hs = new HashSet<>();
        
        int i = 100000;
        System.out.println(System.nanoTime());
        while(i>0){
            al.add(i);
            i--;
        }
        
        i = 100000;
        System.out.println(System.nanoTime());
        while(i > 0){
            hs.add(i);
            i--;
        }
        
        System.out.println(System.nanoTime());
        al.contains(23500);
        System.out.println(System.nanoTime());
        hs.contains(23500);
        System.out.println(System.nanoTime());
        
    }
    
    public static void main(String args[]){
        ArrayListvsHashSet arrayListvsHashSet = new ArrayListvsHashSet(); 
    }
}
