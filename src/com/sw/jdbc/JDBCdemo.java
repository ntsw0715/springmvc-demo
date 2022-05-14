package com.sw.jdbc;

import java.sql.*;

public class JDBCdemo {

    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://127.0.0.1:3306/db1";
        String username = "root";
        String password = "";
        Connection conn = DriverManager.getConnection(url, username, password);

        String sql = "update db_table01 set name = 'shenwei' where  age = 23";
        Statement stmt = conn.createStatement();
        int count = stmt.executeUpdate(sql);
        System.out.println(count);

        stmt.close();
        conn.close();
    }
}
