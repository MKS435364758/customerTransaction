package com.BankProject.customerTransaction.dbTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingTables {

    public static void main(String[] args) throws SQLException {

        try (Connection connection = DriverManager.getConnection(CustomerTable.URL, CustomerTable.USER, CustomerTable.PASSWORD);
             Statement statement = connection.createStatement();) {
            statement.execute(CustomerTable.TABLE_CUST_QUERY);
            statement.execute(TransactionTable.TABLE_TRANS_QUERY);
        }catch (SQLException e){
            System.out.println(e);
        }
    }



}
