/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortal;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Random;

/**
 *
 * @author christoftobias.weick
 * @param <T>
 */
public class SortAl<T extends Comparable<T>>{
    
    /**
     *
     * @param al
     * @return
     */
    public ArrayList<T> sortInteger(ArrayList<T> al) { 
       for(int currentIndex = 1;currentIndex < al.size();currentIndex++){
           T i = al.get(currentIndex);
           
           if(((T)al.get(currentIndex-1)).compareTo(i) < 0){
               
           } else {
               List<T> slice = ((ArrayList<T>)al.clone()).subList(0, currentIndex);
               Collections.reverse(slice);
               int ind = currentIndex;
               for(T reverse : slice){
                   if(!((0 > reverse.compareTo(i)))){
                       ind--;
                   }else{
                   }
               }
               if(ind != currentIndex){
                   al.remove(currentIndex);
                   al.add(ind, i);
               }
           }
       }
       return al;
    }
    public static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
                throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
