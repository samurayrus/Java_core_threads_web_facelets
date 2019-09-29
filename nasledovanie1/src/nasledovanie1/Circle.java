
package nasledovanie1;

public class Circle extends Rect{
        private int r;
    
    public Circle( int a, int b, int x0, int y0,int r) {
        super(x0,y0,a, b);
        this.r = r; 
    }
    
   public double radD()
    {
    return Math.PI*r*r;
    }  
       public void info()
    {
       super.info();
        //info();
        System.out.println("Площадь круга: Circle " + (int)radD());
    }
}
