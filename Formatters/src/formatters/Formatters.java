package formatters;
import java.util.*;

public class Formatters {
    public static void main(String[] args) {
        System.out.println(max2(23*80,555));
        System.out.println(max2("abb","baa"));  //ошибка.Сравнивает по соответствующим местам. abcd <ba тк a<b и тд 
        ArrayList <String> list; //Коллекция. <String> можем полложить только строку. <> без - все, <Integer > int. Увеличивает безопасность
        list = new ArrayList<>();
        list.add("test");
        list.add("4");
        Formatter fm = new Formatter();
        Calendar date = Calendar.getInstance();
        fm.format(new Locale(""),"%tA %1$tB %1$tD\n", date); // 1$ означает, что нужно брать параметры из первого 
        System.out.println(fm);
    }
    
        public static<T extends Comparable<T>> T max2(T a, T b)
        {
        T max =a;
        if(b.compareTo(max)>0) max=b;
        return max;
        }
    
}
