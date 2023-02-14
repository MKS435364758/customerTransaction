package com.BankProject.customerTransaction.dbTable;

public class TransactionTable {

    final static String URL = "jdbc:postgresql://localhost:5432/customer_transaction";

    final static String USER= "postgres";

    final static String PASSWORD= "admin";


    final static String TABLE_TRANS_QUERY = "drop table if exists transactions cascade;" +
            "create table transactions (" +
            "transactionId serial not null unique," +
            "accountNumber bigserial not null," +
            "transactionAmount numeric(8,2)," +
            "remainingBalance numeric(8,2),"+
            "transactionTime timestamp not null," +
            "transactionType text not null," +
            "primary key(transactionId)," +
            "foreign key(accountNumber) references customers (accountNumber));";

}
