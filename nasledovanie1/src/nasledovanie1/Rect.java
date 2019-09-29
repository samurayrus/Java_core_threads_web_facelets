package nasledovanie1;

public class Rect extends Shape{
    private int a,b;
    
    public Rect( int a, int b, int x0, int y0) {
        super(x0, y0);
        this.a = a;
        this.b = b;  
    }
    public final double area()
    {
    return (double)a*b;
    }   
    
    @Override
    public void info()
    {
        super.info();
        System.out.println("a/b(Rect)"+a+" "+b);
    }
}
