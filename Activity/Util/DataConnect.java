package Activity.Util;

import java.sql.*;

public class DataConnect {
  private static Connection con;

  private DataConnect(){
     try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Shopee","root","Bigchill@510");
        System.out.println("Data Connected");

     } catch (ClassNotFoundException ex) {
        System.out.println(ex.getMessage());
        ex.printStackTrace();

     }catch(SQLException ex){
        System.out.println(ex.getMessage());
        ex.printStackTrace();
     }
  }   

  public static Connection getConnect(){
    DataConnect d1 = new DataConnect();
    return con;
  }

}
