package java2_sw;
import java.util.*;
import javax.swing.*;


public class mymodel extends AbstractListModel<String> {
List <String> list = new ArrayList<>(100);

    public int getSize() {
       return list.size();
    }


    public String getElementAt(int i) {
        return list.get(i);
   
    }
    
}
