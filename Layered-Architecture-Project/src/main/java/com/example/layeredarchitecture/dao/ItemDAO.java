package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;

    void saveItem(ItemDTO item) throws SQLException, ClassNotFoundException;

    void updateItem(ItemDTO item) throws SQLException, ClassNotFoundException;

    boolean updateItem(ItemDTO item, int one) throws SQLException, ClassNotFoundException;

    void deleteItem(String code) throws SQLException, ClassNotFoundException;

    boolean existItem(String code) throws SQLException, ClassNotFoundException;

    String getNextCode() throws SQLException, ClassNotFoundException;

    ArrayList<String> getAllItemCodes() throws SQLException, ClassNotFoundException;

    ItemDTO findItem(String code);
}
