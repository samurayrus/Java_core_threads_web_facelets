package pract4;
import java.util.Arrays;
import java.util.Comparator;

class Point implements Comparable
{
    static private class ComPointY implements Comparator{//второй тип сортировки

    @Override
    public int compare(Object o1, Object o2) {
      Point p1 = (Point)o1;
      Point p2 = (Point)o2;
      return p1.y-p2.y;
    }
    
}
private final int x,y;
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x+":"+y;
    }
@Override
    public int compareTo(Object obj)
    {
    Point p =(Point)obj;
    int res = x-p.x;     //сравнение по х,Вычитаем
    if(res==0) res=y-p.y;
    return res; 
    }
    
    public static Comparator cmbyY(){ //из-а приватности. просто вернуть нельзя напрямую
    return new ComPointY();
    }
    
}

public class Pract4 {
    public static void main(String[] args)
    {
        Point d[]={new Point(3,5), new Point(2, 12), new Point(6, 9), new Point(4, 7)};
        Arrays.sort(d,Point.cmbyY());
        System.out.println(Arrays.toString(d));
    }
}