package nasledovanie1;


public abstract class Shape extends Object{
private int x0,y0;

    public Shape(int x0, int y0) {
        this.x0 = x0;
        this.y0 = y0;
    }
    public Shape move(int dx, int dy){x0+= dx;y0+= dy; return this;}
      
    public abstract double area();
  
    public void info()
    {
        System.out.println("x0_y0(Shape)"+x0+" "+y0);
    }
    
}
