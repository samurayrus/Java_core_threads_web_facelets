package lab5_p15;


public class Test_cl implements Imonitor{            //слушатель с интерфейсом 101
    public void added(String fname) {System.out.println("add TestCl " + fname);}
    public void deleted(String fname) {System.out.println("del TestCl " + fname);}
    
    
}
