package sql2;

import com.microsoft.sqlserver.jdbc.*;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Scanner;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
/**
 *  Файл конфига с JNDI и подключение
 * 
 */

public class Sql2 {
     public static void main(String[] args) throws NamingException, SQLException {
        //создание объекта конфига
         Scanner sc = new Scanner(System.in);
         switch(sc.nextInt())
         {
             case 0:
                 
                 //Сохраняем файл конфигурации, в котором назначаем 
                 //юзера, пароль не задается, так как он не зашифрован и файл его не примет
                 // Записываем название бд
                 //ip и сервер
                 //Записываем - bind - con5
                 //ds.setPortNumber(portNumber); --> С портом сложно, лучше убрать
             SQLServerDataSource dd = new SQLServerDataSource();
             dd.setUser("sa");
             dd.setPassword("1234");
             dd.setDatabaseName("AdventureWorks");
             dd.setServerName("10.5.4.150\\SQLExpress");  
             getContext().bind("con5", dd);        //Регистрируем объект
             
                 break;
             case 1: 
                
                 //Получение конфига из файла. В итоге, нам нужно знать только название
                 //конфигурации, логин и пароль. Хардкод отсутствует почти.
                 DataSource ds;
                 ds = (DataSource)getContext().lookup("con5");
                 ds.getConnection("sa","1234");

                 break;
         }
    }
     static Context getContext() throws NamingException
     {
    // @SuppressWarnings("UseOfObsoleteCollectionType")
     Hashtable env = new Hashtable();
     env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.fscontext.RefFSContextFactory");
     //env.put(Context.PROVIDER_URL, "file:" + directoryName);//из вне передаем папку где хранится конфигурация
     env.put(Context.PROVIDER_URL, "file:C:\\Users\\Public");
     Context context = new InitialContext(env);  //создаем файл конфигурации. Его нам перезаписать не дадут
     
     return context;
     }
}
