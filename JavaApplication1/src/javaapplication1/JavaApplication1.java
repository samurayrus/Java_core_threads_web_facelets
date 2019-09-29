/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author Student1
 */
public class JavaApplication1 {

    public static void main(String[] args)
    {
        double a,b=7,c=0;
        a=(b/c);
        System.out.println(a);
        
        float f = 5.5f;
        long num =2_837_438_473L;
        int bin= 0b1100_0111_0001;
        System.out.println(bin);
        System.out.println(f);
        System.out.println(num);
        System.out.println(ara(1,2,3,4,5) +"SS");
        
       
    }
   public static int ara(int ...arg)
   {
       int s=0;
       for(int i =0; i<arg.length;i++)
       {
          System.out.println(arg[i]);  
          s=s+arg[i];
       }
      
      //for(int item : arg) {s+=item;} //цикл короче. Сам проходит по всем.
      
    return s;
   }
    
}
