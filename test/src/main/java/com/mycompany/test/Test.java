package com.mycompany.test;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Test {
    public static void main(String[] args){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=factory","sa" ,"123");
            String n = "test";
            Statement st = c.createStatement();
            String sql = "insert into department values('"+n+"')";
            int x = st.executeUpdate(sql);
            System.out.print(x);
            c.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "connector not found!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


/* insert, update, delete

            String n = "test";
            Statement st = c.createStatement();
            String sql = "insert into department values('"+n+"')";
            int x = st.executeUpdate(sql);
            System.out.print(x);

*/
/* select 
 
            Statement st = c.createStatement();
            String sql = "select * from department";
            ResultSet resultSet = st.executeQuery(sql);
                    while (resultSet.next()) {
                        System.out.println(
                                resultSet.getInt("number") + " " + resultSet.getString("name"));
                    }

*/