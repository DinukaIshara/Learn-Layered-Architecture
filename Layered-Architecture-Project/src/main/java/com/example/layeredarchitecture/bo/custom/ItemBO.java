package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.bo.SuperBO;
import com.example.layeredarchitecture.dto.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBO extends SuperBO {
    ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException ;


    boolean saveItem(ItemDTO itemDTO) throws Exception;


    boolean updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;


    void deleteItem(String id) throws SQLException, ClassNotFoundException;

    boolean existItem(String id) throws SQLException, ClassNotFoundException;
    String generateNewID() throws SQLException, ClassNotFoundException;

}
