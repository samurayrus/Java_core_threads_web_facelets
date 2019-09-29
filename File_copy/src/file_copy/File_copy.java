package file_copy;
import java.io.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class File_copy {
    public static void main(String[] args) throws Exception
    {
   // double []d = {1,3,4,5.1,2,5,23,12/3,5.6,9.03+2.2,Math.sin(0.4),88};
        double d [] = new double[5];
    Scanner sc = new Scanner(System.in);
        System.out.println("Введите 5 чисел double: \n Для воода допускаются 'n',',',' ' ");
   try{ for(int i=0;i<d.length;i++)
    {d[i]=sc.nextDouble();}}
   catch(InputMismatchException ex) {System.out.println("ERR InputMismatchException \n Для воода допускаются 'n',',',' '");}
    String enc = "UTF-16", name = "unicode.txt";  //enc -- кодировка
    //"Cp1251" "ascii.txt" "UTF-16" "unicode.txt"
    BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(name), enc));//необходима throws обработчик исключений
    String b="";
     while(b!=null){b = br.readLine(); if(b!=null)System.out.println(b);}
     System.out.println("   [End_br.Reader]");
    br.close();
    save(d,"data.txt");
    }

    private static void save(double[] d, String name)
    {
        try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(name))))
        //Создается три объекта для чтения. Data --> buffer --> file , матрешка. dos - файл.
        {
            System.out.println("   [Saver]");
        dos.writeInt(d.length); System.out.println("Leng: "+d.length);
        for(double di : d) {dos.writeDouble(di);}  //записываем.
        }
        catch(IOException ex) {
        ex.printStackTrace();
        }
        System.out.println("   [End_write&create]");
        load("data.txt");
    }

    private static void load(String name)
    {
    //DataInputStream dos =
        double tt[] = new double[50];
        try(DataInputStream dos = new DataInputStream(new BufferedInputStream(new FileInputStream(name))))
        //Создается три объекта для чтения. Data --> buffer --> file , матрешка. dos - файл.
        {
        int size = dos.readInt();
            System.out.println("Size_read: " + size);
        for(int a=0;a<size;a++)
        {
            tt[a]=dos.readDouble();//считываем.
            System.out.println(a+1+" : "+ tt[a]);
        }}
        catch(EOFException ex){System.out.println(" (End_file)");}
        catch(IOException ex){ex.printStackTrace();}

            System.out.println("   [End_Read]");
    }
    
}
