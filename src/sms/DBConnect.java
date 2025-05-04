///* 
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package sms;
//
///*
// *
// * @author reala
// */
import java.sql.*;


public class DBConnect {
    
    public static void main(String[]args){
        
      
    
    try{
    
    Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","lalit@123");
   System.out.println(con);
    Statement s=con.createStatement();
   System.out.println(s);
    } // try closed
    
    
    catch(Exception e){
        e.printStackTrace();
    }// catch closed
    
    }
    
    
}
