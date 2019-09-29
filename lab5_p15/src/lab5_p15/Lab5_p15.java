package lab5_p15;
/**
 * 
 * @author Maxim
 * Эта лаба проверяет указанный каталог и ждет там 3 
 * изменения (Удаление/Создание файла). 
 * затем выводит сразу сообщение с название файла через консоль. 
 * Связь поддерживается через реализованный интерфейс Observer
 * 100/101 (light_pro versions)  102 - анонимный класс
 */

public class Lab5_p15 {
    public static void main(String[] args) throws Exception { 
    FMonitor mon = new FMonitor(".");
    
   // mon.addListener(new Test_cl()); //101
    mon.addListener(new Imonitor() {                            //102 [ANON_START]
        @Override                                               //102
        public void added(String fname) {                       //102
            System.out.println("add [anon] TestCl " + fname);   //102
           }                                                    //102
                                                                //102
        @Override                                               //102
        public void deleted(String fname) {                     //102
            System.out.println("del [anon] TestCl " + fname);   //102
            }                                                   //102
        });                                                     //102 [END]
    mon.start();
    
    }
    
}
