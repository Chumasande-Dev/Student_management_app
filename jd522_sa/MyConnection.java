/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jd522_sa;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author liyam
 */
class MyConnection {
    MyConnection con = null;
    public static Connection connectionDB(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\liyam\\OneDrive\\Documents\\NetBeansProjects\\JD522_SA\\Hospital");
        System.out.print("Connection Successful");
        return con;
    }catch(Exception e){
        e.printStackTrace();
        return null;
    }
    }
}
