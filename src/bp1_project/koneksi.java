package bp1_project;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi {
    public Connection con;
    
    public koneksi () {
        String id, pass, driver, url;
        id="root"; //user DBMS MySql
        pass=""; //password DBMS MySql
        driver="com.mysql.jdbc.Driver"; //driver MySql
        url="jdbc:mysql://localhost:3306/db_mhs"; //nama database : db_mhs
        
        try
        {
            Class.forName(driver).newInstance();
            con=DriverManager.getConnection(url,id,pass);
           
        }
        catch(Exception e)
        {
            System.out.println(""+e.getLocalizedMessage());
        }
    }
    
    public static void main (String[]args)
    {
        koneksi k=new koneksi();
    }
}