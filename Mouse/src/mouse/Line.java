package mouse;
import java.lang.Thread;
import java.awt.Graphics;



public class Line {
    private int x0,y0,x1,y1;

    public Line(int x0, int y0, int x1, int y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }
    public void drow(java.awt.Graphics gr) throws InterruptedException       
    {
    gr.drawLine(x1,y1,x0,y0);
    // Thread.sleep(10); для зарисовки не сплошной
    }
}
