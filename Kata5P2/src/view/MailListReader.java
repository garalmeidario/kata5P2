package view;

import model.Mail;

import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MailListReader{
    
    public MailListReader(){}
    
    public List<String> read(String url, String table) throws IOException{
        List<String> mails = new ArrayList<>();
        String sql = "SELECT * FROM " + table;
        try (Connection conn = DriverManager.getConnection(url); 
                Statement stmt = conn.createStatement(); 
                ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) { 
                mails.add(rs.getString("mail")); 
            } 
        } catch (SQLException e) { 
            System.out.println(e.getMessage()); 
        }
        return mails;
    }
    
}
