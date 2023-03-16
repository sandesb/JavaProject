/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author home
 */
public class DBconnection {

    Connection connection = null;

    public DBconnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbUrl = "jdbc:mysql://localhost:3306/stream";
            String name = "root";
            String password = "";

            connection = DriverManager.getConnection(dbUrl, name, password);
            System.out.println("DBconnected!!");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("not connected!!!");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        DBconnection dbconnection = new DBconnection();
    }

    public PreparedStatement getStatement(String query) {
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }
}
