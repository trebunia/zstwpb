package com.zstwpb.faultmapp;
import android.util.Log;

import java.sql.*;


/**
 * Created by Wojtaszek on 05.01.2019.
 */

public class SqlConnect {
    //Class.forName("org.postgresql.Driver");
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:postgresql:31.14.140.208:55432/zstwpb";
    static final String USER = "zstwpb";
    static final String PASSWORD = "zstwpb";

    Connection db = DriverManager.getConnection(DB_URL, USER, PASSWORD);

    public SqlConnect() throws SQLException {

    }
    Statement st = db.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM account");

    public void GimmieData() throws SQLException {
        while (rs.next()) {
            Log.d("Column 1 returned ", rs.getString(1));

            System.out.println(rs.getString(1));
        }
    }

    public void ClosingConnection() throws SQLException {

        rs.close();
        st.close();

        db.close();
    }
}
