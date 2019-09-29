/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_sql;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import static java.lang.System.in;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MYSQL  {
     //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
  // static String url = "jdbc:sqlserver://10.5.4.150;database=AdventureWorks";
    static String url= "jdbc:sqlserver://10.5.4.150\\SQLExpress;database=AdventureWorks;";
    
    public static void putPhoto(String name, String path) throws Exception
{
   // try{
        Connection con = DriverManager.getConnection(url, "sa", "1234");
        File file = new File(path); //иниц по path
        int  size=(int)file.length(); //ВЕС ФАЙЛА
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));
        String sql ="Insert into dbo.pictures (name,photo) Values(?,?)";
       // CallableStatement st = con.prepareCall(sql);
       PreparedStatement srr;
        srr = con.prepareStatement(sql);
        srr.setString(1, name);
        srr.setBinaryStream(2, fis);
        
       // CallableStatement st = con.prepareCall(sql);
        //String uru = name;
       // BinaryStream;
        srr.executeUpdate(); //загрузка
   // }
    //catch(SQLException ex) { System.out.println("asdasdsadad_ERR");}

}
}

