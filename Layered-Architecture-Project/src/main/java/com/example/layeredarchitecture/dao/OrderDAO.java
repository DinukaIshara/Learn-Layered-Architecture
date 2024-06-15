package com.example.layeredarchitecture.dao;

import java.sql.*;
import java.time.LocalDate;

public interface OrderDAO {
    int saveOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;

    String nextOrderId() throws SQLException, ClassNotFoundException;
}
