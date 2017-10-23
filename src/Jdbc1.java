// program for select query

import java.sql.*;

public class Jdbc1 {
    Connection con=null;
    Statement stmt=null;
    ResultSet rs=null;// it is only used for select
    public Jdbc1() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
        stmt=con.createStatement();
    }
    void getdata() throws SQLException {
        rs=stmt.executeQuery("select * from student");
        while(rs.next())
        {
            System.out.println("id:"+rs.getInt(1)+"  name:"+rs.getString(2)+"  city:"+rs.getString(3));
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Jdbc1 j=new Jdbc1();
        j.getdata();
    }

}
