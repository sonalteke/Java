// insert,update and delete record using preparedsatatement

import java.sql.*;
import java.util.Scanner;

public class PrepareDemo {
    Connection con=null;
    PreparedStatement pst=null;

    public PrepareDemo() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
    }
    void insertData()throws SQLException{
        Scanner s=new Scanner(System.in);
        System.out.println("enter id:");
        int id=s.nextInt();
        System.out.println("enter name:");
        String name=s.next();
        System.out.println("enter city:");
        String city=s.next();
        pst=con.prepareStatement("insert into student values(?,?,?)");
        pst.setInt(1,id);
        pst.setString(2, name);
        pst.setString(3, city);
        pst.execute();
        System.out.println("Record insereted...");
    }
    void updateData() throws SQLException {
        Scanner s=new Scanner(System.in);
        System.out.println("enter id to update record:");
        int id=s.nextInt();
        pst=con.prepareStatement("update student set name='Amar' where id=?");
        pst.setInt(1,id);
        pst.execute();
        System.out.println("Record updated....");
    }
    void deleteData() throws SQLException {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter id to delete record:");
        int id=s.nextInt();
        pst=con.prepareStatement("delete from student where id=?");
        pst.setInt(1,id);
        pst.execute();
        System.out.println("Record deleted....");
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        PrepareDemo ps=new PrepareDemo();
        //ps.insertData();
       // ps.updateData();
        ps.deleteData();
    }
}
