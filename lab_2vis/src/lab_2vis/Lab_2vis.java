/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2vis;

/**
 *
 * @author Student1
 */
public class Lab_2vis {
    public static void main(String[] args) {
        int year = 2019, dayNum=222;
        int[]daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] months= {"Январь","Февраль", "Март"," Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь", "Ноябрь","Декабрь"};
 int monthNum=0;
 boolean isLeapYear= (year%4==0)&& (year%100!=0 || year%400==0);
 for(int days : daysInMonths)
 {
     if(isLeapYear && days==28)days++;
     //System.out.println(days);
     if(dayNum<days)
     break;
     dayNum-=days;
     monthNum++;
 }
        System.out.printf(dayNum +" mm "+ months[monthNum]);
 }
    }
    

