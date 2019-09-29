package mouse;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Mouse extends Frame { 
  class MyMouse extends MouseAdapter {
    private int x0,y0;
    public void mousePressed(MouseEvent e) {
        
        x0=e.getX();
        y0=e.getY();
    }
//mouseDragged -- для зарисовки
    public void mouseReleased(MouseEvent e) {
        //int x1=e.getX(), y1=e.getY();
          Line lines = new Line(x0, y0, e.getX(), e.getY());
          list.add(lines);
        try {
            lines.drow(getGraphics());
            // Graphics gr=getGraphics();
            // gr.drawLine(x0, y0, x1, y1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Mouse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  }
    java.util.List<Line> list=new java.util.LinkedList<>();
   
public void mouse(Graphics g) throws InterruptedException{ 
    for(Line item :list) item.drow(g);
}

  public Mouse() {
    setSize(800,800);
    addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) { System.exit(0); }
    });
    MyMouse mm=new MyMouse();
    addMouseListener(mm);
    addMouseMotionListener(mm);
    setMenuBar(getMB());
    setVisible(true);
  }
  MenuBar getMB() {
   MenuItem exit = new MenuItem("Выход");
   MenuItem save = new MenuItem("Сохр");
   MenuItem load = new MenuItem("Откр");
   Menu file = new Menu("Файл");
   file.add(load);
    file.add(save);
     file.add(exit);
     MenuBar mb = new MenuBar();
     mb.add(file);
     return mb;
  }
    
    public static void main(String[] args) {
        new Mouse();
    }
}

    
    

