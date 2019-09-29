package mycounter;

import java.io.IOException;


public class MyCounter {


    public static void main(String[] args) throws IOException {
        SimpleParser sp=new SimpleParser();  
        sp.Parse(args);
        
        //WorldCounter wc=new WorldCounter(null,null);
        WorldCounter wc = new WorldCounter(sp.getInFile(), null);
        wc.countWords();
        for(Object item:wc.getValues())
         System.out.println(item);
        
        
      //  for(Object obj : wc.getWords().keySet())
      //  {String w = obj.toString();
     // int n =(int)wc.getWords().get(w);
     //   System.out.println(w+"   "+ n);
        
      //  }
      //  Enumeration keys = wc.getWords().keys();
       // while(keys.hasMoreElements()){
       //    String w=keys.nextElement().toString(); 
       //    int n= (int)wc.getWords().get(w);
       //    System.out.println(w+"   "+n);
        }             
    }
