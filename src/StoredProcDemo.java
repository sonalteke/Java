//insert,update,delete using stored procedure

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class StoredProcDemo {
    Connection con = null;
    CallableStatement callstmt = null;
    Scanner s = new Scanner(System.in);

    public StoredProcDemo() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
    }
    void callprocedure() throws SQLException {
        callstmt = con.prepareCall("{call insert4()}");
        callstmt.execute();
        System.out.println("Record inserted,updated,deleted....");
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        StoredProcDemo s = new StoredProcDemo();
        s.callprocedure();
    }
}

