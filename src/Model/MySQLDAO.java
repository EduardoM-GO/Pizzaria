/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
/**
 *
 * @author user
 */
public class MySQLDAO {
    
    public static final String DRIVER="com.mysql.jdbc.Driver";
    public static final String DBURL="jdbc:mysql:///pizzaria"; 
    private static Connection con;

    public static Connection getConnection() {
        if (con == null) {
            try {
                Class.forName(DRIVER).newInstance();
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria?autoReconnect=true&useSSL=false", "root", "");
            } catch (Exception e) {
                System.err.println("Exception: " + e.getMessage());
            }
        }
        return con;
    }

    public static ResultSet getResultSet(String query, Object... parametros) {
        PreparedStatement psmt;
        ResultSet rs = null;
        try {
            psmt = con.prepareStatement(query);
            for (int i = 0; i < parametros.length; i++) {
                psmt.setObject(i + 1, parametros[i]);
            }
            rs = psmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static long executeQuery(String query, Object... parametros) {
        long update = 0;
        PreparedStatement psmt;
        try {
            psmt = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            for (int i = 0; i < parametros.length; i++) {
                psmt.setObject(i + 1, parametros[i]);
            }
            psmt.setObject(3, 1);
            psmt.execute();//
            ResultSet rs = psmt.getGeneratedKeys();
            if (rs != null && rs.next()) {
                update = rs.getLong(1);
            }
            psmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return update;
    }

    public static void terminar() {
        try {
            (MySQLDAO.getConnection()).close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}