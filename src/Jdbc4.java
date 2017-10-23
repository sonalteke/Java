// Delete Query

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc4 {
    Connection con=null;
    Statement stmt=null;
    public Jdbc4() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
        stmt=con.createStatement();
    }
    void delete() throws SQLException {
        int a=stmt.executeUpdate("delete from student where id=6");
        System.out.println(a);
        if(a==1){
            System.out.println("Record deleted...");
        }else{
            System.out.println("Record not deleted");
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Jdbc4 j=new Jdbc4();
        j.delete();
    }
}
