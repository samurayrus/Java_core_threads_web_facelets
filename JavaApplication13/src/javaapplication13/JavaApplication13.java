package javaapplication13;
import java.util.*;
import java.util.Collections;
import java.util.function.*;
public class JavaApplication13 {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,2,5,8,11,4,9,3);
        //System.out.println(System.getProperty("os.name")); получение системы
      
   //     solve(list,x->x%2==0, x->System.out.println(x));     //x->x%2==0 это фильтр. Нужна х только если остаток от деления на 2 будет 0
   //1 list.stream().forEach(System.out::println);  //вызов дополнительных и вспомогательных функций
    list.stream().filter(x->x%2==0).forEach(System.out::println); // можно исп несколько таким образом.
   double avr =  list.stream().filter(x->x%2==0).   //////
            mapToInt(x->x).average().getAsDouble(); //Сумма всех чисел после смены типа
        System.out.println("avr"+avr);              ///// stream -интерфейс
        list.stream().sorted().forEach(System.out::println);
    }  
        public static<T> void solve(Collection<T> col, Predicate<T> filter, Consumer<T> work)    //Делаем generic метод //  потом нужно будет сделать наследника коллекции, чтобы можно было один тип передавать на место другого
        {
            for(T item : col)
              {
                if(filter.test(item)) work.accept(item);
              }
        }   
}
