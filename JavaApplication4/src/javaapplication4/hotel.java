 package javaapplication4;

public class hotel
{
    private String name;
    private int stars, rooms;
    private boolean pool;
    final boolean sea; // неизменяемая переменная, можно задать только один раз
    private static String owner="owner";
    public int getStars() {
        return stars;
    }
    static {owner = "picatu";}
    public static String getOwner()
    {
    return owner;
    }
    public void setStars(int stars) {
        this.stars = stars;
    }
    public hotel(String name, int stars, int rooms)
    {
        this(name,stars,rooms,false); //передача конструктору с 4 элементами
    }
    {System.out.println("Object_created");} // блок кода выполняется при создании объекта
    public hotel(String name, int stars, int rooms, boolean pool) {
        this.name = name;
        this.stars = stars;
        this.rooms = rooms;
        this.pool = pool;
        sea=true;
    }
   
        public hotel info()
        {
            System.out.println(name + " " + stars + " " + rooms + " " + pool + " " + sea +" " + owner);
            return this;
        }
}
