// Delete record through user

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc5 {
    Connection con=null;
    Statement stmt=null;
    public Jdbc5() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
        stmt=con.createStatement();
    }
    void userdelete() throws SQLException {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the id for delete:");
        int id=s.nextInt();
        int a=stmt.executeUpdate("delete from student where id="+id);
        System.out.println(a);
        if(a==1){
            System.out.println("Record deleted...");
        }else{
            System.out.println("Record not deleted...");
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Jdbc5 jd=new Jdbc5();
        jd.userdelete();
    }
}
