/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author HaiDao
 */
public class Connect {
     private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL="jdbc:mysql://localhost:3306/javaproject2?serverTimezone=UTC&autoReconnect=true&useSSL=false";
	
	private static final String USER = "tiendd";
	private static final String PASSWORD = "1234";
	
	private static Connection conn;
	
	public static Connection createConnection() {
            try {
                    Class.forName(JDBC_DRIVER);
                    conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            } catch (Exception e) {
                    e.printStackTrace();
            }
            return conn;
	}
	
	public static Connection  getConnection() {
		return conn == null ? createConnection() : conn;
	}
    
}
