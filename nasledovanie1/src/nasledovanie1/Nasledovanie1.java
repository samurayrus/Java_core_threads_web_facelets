
package nasledovanie1;

public class Nasledovanie1 {


    public static void main(String[] args) {
        Rect r1 = new Rect(5,6,3,-8);
        r1.info();
        r1.move(1,0).move(0,2);

        
        Circle c1 = new Circle(3,5,1,-3,5);
        c1.info();
        c1.move(4,1);
       //System.out.println(c1.area());
        Shape sh[]={r1,c1,new Circle(2,3,2,-5,8)};
        paint(sh);
    }
//
     static void paint(Shape[] sh) {
      for(Shape item:sh) item.info();//полиморфизм
      
         /*  for(Shape item:sh)
        {
        if(item instanceof Rect)
        {
            System.out.println("RECT");
            Rect r =(Rect)item;
            r.info();
        }
        else
        {
            if(item instanceof Circle)
            {
                Circle c =(Circle)item;
                System.out.println("CIRCLE");
                c.info();
            }
        }
        }*/
        
    }
    //
}
