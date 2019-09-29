
package lab2;


public class Lab2 {

    public static void main(String[] args) {

        ComLineParser as = new ComLineParser(new String[]{"?","r","w" },new String[]{"/","-"});
        as.Parse(new String[]{"-wOutfileName", "-rInfileName"});
    }
    
}
