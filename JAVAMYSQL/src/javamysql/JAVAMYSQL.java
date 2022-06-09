/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamysql;


import java.sql.*;

public class JAVAMYSQL {

    
    public static void main(String[] args) {
        String sql = "Select * from status";
        
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            //here sonoo is database name, root is username and password
            try (Connection con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/attendance","root","")) {
               
                //Statement stmt=con.createStatement();
                
                PreparedStatement ps = con.prepareStatement(sql);
                //this is the query sentence
                ResultSet rs=ps.executeQuery();
                while(rs.next()) {
                     System.out.println(" " + rs.getString(1) + " " + rs.getString(2));
                }
                    
                    //System.out.println(rs.getString(1)+"  "+rs.getString(2));
            }  
          }catch(Exception e) { 
              System.out.println(e);
          }  
    }
    
}
