package sql1;
import java.sql.*;
import java.util.Scanner;
//хардкод + подключение к бд + получение текущего каталога
public class Sql1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //
        String url= "jdbc:sqlserver://10.5.4.150\\SQLExpress;database=AdventureWorks;";   // SQLExpress - название субд,
        Connection con = DriverManager.getConnection(url, "sa", "1234");
        System.out.println(con.getCatalog());
        DatabaseMetaData info = con.getMetaData();
        ResultSet res = info.getTables(null, null, "P%", null);
        System.out.println("Table");
        while(res.next())  //перевод чтения на следующую строку. get - чтение элемента строки
         {
         System.out.println("ttk      " + res.getString(2)+ "   "+ res.getString(3) + "   "+ res.getString(4));
        }
        Statement st = con.createStatement();
        res.close();
        res = st.executeQuery("Select *from Production.Product");
        while(res.next()) {
        //System.out.println("ttk      " + res.getString(2)+ "   "+ res.getString(3) + "   "+ res.getString(4));
        System.out.printf("%20s %23s %9s\n ", res.getString(2), res.getString(3), res.getString(4));
        }
       //res.close();
           con.close();
        
    }
    
}
