
package javaapplication4;

import java.util.Date;

public class JavaApplication4 {

    public static void main(String[] args) {
    // System.out.println("Owner: " + hotel.owner);
    System.out.println(hotel.getOwner());
    hotel h1 = new hotel("Afg",4,27);
    hotel h2 = new hotel("wqe",3,45, true);
    h1.info();
    //h2.stars=5;
    h2.setStars(6);
        
    h2.info().info();
     h1.info();
        System.out.println(h1.getOwner()+ " " + new Date());
    }
    
}
