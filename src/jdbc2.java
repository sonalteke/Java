// insert query

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class jdbc2 {
    Connection con=null;
    Statement stmt=null;

    public jdbc2() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
        stmt=con.createStatement();
    }
    void insert() throws SQLException {
        int a=stmt.executeUpdate("insert into student values(6,'Rupali','pune')");

        System.out.println(a);
        if(a==1){
            System.out.println("Record inserted....");
        }else{
            System.out.println("Record not inserted....");
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        jdbc2 j=new jdbc2();
        j.insert();
    }
}
