 package sql3;
 import java.sql.*;

public class Sql3 {

 
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //
        String url= "jdbc:sqlserver://10.5.4.150\\SQLExpress;database=AdventureWorks;";   // SQLExpress - название субд,
        Connection con = DriverManager.getConnection(url, "sa", "1234");
        /////////////////////////////////////
        //102 Хранимая процедура
        String sql = "{call dbo.uspGetManagerEmployees(?)}";
        CallableStatement st = con.prepareCall(sql);
        st.setInt(1,263);
        ResultSet rs = st.executeQuery();
        while(rs.next())  //чекаем построчно для вывода
        {System.out.printf("%d %s %s %s %s\n", rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(5), rs.getString(6));}
        con.close();
        //102___
        ////////////////////////////////////////////////////
      //101  
//        //select top 20 * from Person.Contact
//        // указывается возможность обновления 
//        //базы, перехода по строкам и изменения их.
//        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
//				       ResultSet.CONCUR_UPDATABLE);
//  
//        ResultSet rs= st.executeQuery("select top 20 * from Person.Contact");  // первые 20
//        while(rs.next())  //чекаем построчно для вывода
//        //{System.out.println("%4s %12s %33s\n", rs.getString(1), rs.getString(4), rs.getString(8));}
//        {
//            System.out.println("  "+ rs.getString(1)+"  "+rs.getString(4)+"  "+rs.getString(8)); // само чтение и вывод
//            
//        }
//        rs.absolute(7); //переходим к 7 строке
//        rs.updateString(4, "Абубу"); //4 столбец заменяем на Абубу
//        rs.updateRow(); //закидываем в бд изменения (обновляем)
//
//        con.close();
//    //101
       //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

    }
    
}
