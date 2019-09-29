package javaapplication12;
import java.io.*;
import java.util.Scanner;


//  class MyFilter implements FileFilter{           // АП 3
//public boolean accept(File name){
//    return name.getName().endsWith(".xml");
//}
//
//}


public class JavaApplication12 {
    public static void main(String[] args) throws IOException {
/*       File dir = new File(".");
       // 1 File fs[] = dir.listFiles(new MyFilter());
       
// 2      File fs[] = dir.listFiles(new  FileFilter() {   //АП Анонимный класс, чтобы не создавать много паблик классов.
//           @Override
//           public boolean accept(File name) {
//           return name.isFile(); //выводит только файлы
//           }});

  File fs[] = dir.listFiles(x->x.isFile());// Аналогично АП 4

      //5 Лямбда выражения File fs[] = dir.listFiles(JavaApplication12::filtr22);
       for(File fi: fs) System.out.println(fi);
       
    }
    
       public boolean filtr22(File f){
       return f.getName().startsWith("bu");
       */
        System.out.println("Работа с файловой системой. \n ? - вызов справки ");
        String ppt=".";
        A:
        while(true)
        {
        Scanner sc = new Scanner(System.in);
        switch(sc.next())
        {
            case "0":
                File dir = new File(ppt);
                File fs[] = dir.listFiles(x->x.isFile());
                for(File fi: fs) System.out.println(fi);
                break;
            case "1":
                
                Scanner sg = new Scanner(System.in);
                ppt=sg.nextLine();
                System.out.println(ppt +"STRING");
                break;
            case "2":
                File dirr = new File(".");
                File ff [] = dirr.listFiles(x->x.isDirectory());
                for(File fi: ff) System.out.println(fi);
                break;
            case "?":
                System.out.println("[HELP]: \n ? — справка,0-Файлы в каталоге 1, 2 ,3");
                break;
                case "q":
                System.out.println("[EXIT]");
                break A;
                
            
        }
        
        }
    }
              //  public boolean filtr22(File f){
              //  return f.getName().startsWith("bu");}
}
    
