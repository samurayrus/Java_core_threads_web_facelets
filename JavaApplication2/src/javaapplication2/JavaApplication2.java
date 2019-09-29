/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Arrays;

public class JavaApplication2 {
    public static void main(String[] args)
    {System.out.println("Hello Java");
       int a[] = {1,2,3,4,2,123,33};
       int[] b = new int[100];
       Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        
        int[][] hh= new int [2][5];
        for(int[]item:hh)
            System.out.println(Arrays.toString(item));
        //int [][]d3=new int[2][];
        String s1 ="abcd";
        String s2 = new String(s1);
        if(s1==s2){System.out.println("yes");}else{System.out.println("no");}
        System.out.println("ururu \n d  " + s1.length());
    }
    
}
