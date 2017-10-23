//program for update query

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc3 {
    Connection con=null;
    Statement stmt=null;
    Jdbc3() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
        stmt=con.createStatement();
    }
    void update() throws SQLException {
        int a=stmt.executeUpdate("update student set name='Raj' where id=1");
        System.out.println(a);
        if(a==1){
            System.out.println("Record updated...");
        }else{
            System.out.println("Record not updated...");
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Jdbc3 j=new Jdbc3();
        j.update();
    }
}
