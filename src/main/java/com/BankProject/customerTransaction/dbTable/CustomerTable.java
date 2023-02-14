package com.BankProject.customerTransaction.dbTable;

public class CustomerTable {

    final static String URL = "jdbc:postgresql://localhost:5432/customer_transaction";

    final static String USER= "postgres";

    final static String PASSWORD= "admin";


    final static String TABLE_CUST_QUERY = "drop table if exists customers cascade;" +
            "create table customers (" +
            "Id serial unique not null," +
            "customerName text not null," +
            "accountNumber bigserial unique not null," +
            "balance numeric(8,2)," +
            "accountCreationTime timestamp not null," +
            "lastUpdateTime timestamp not null," +
            "primary key(Id));";

}
