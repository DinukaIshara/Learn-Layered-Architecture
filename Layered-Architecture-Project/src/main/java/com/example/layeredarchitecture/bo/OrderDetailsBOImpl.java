package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.OrderDetailsDAO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDetailsDAOImpl;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDetailsBOImpl {
    OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAOImpl();
    public ArrayList<OrderDetailDTO> getAllOrderDetails() throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.getAll();
    }


    public boolean saveOrderDetails(OrderDetailDTO orderDetailDTO) throws Exception{
        return orderDetailsDAO.save(orderDetailDTO);
    }


    public boolean updateOrderDetails(OrderDetailDTO orderDetailDTO) throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.update(orderDetailDTO);
    }


    public void deleteOrderDetails(String id) throws SQLException, ClassNotFoundException {
        orderDetailsDAO.delete(id);
    }


    public boolean existOrderDetails(String id) throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.exist(id);
    }

    public String generateNewID() throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.generateNewID();

    }


    public ArrayList<OrderDetailDTO> getAllOrderDetailsIds() throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.getAll();
    }


    public OrderDetailDTO searchOrderDetails(String newValue) throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.search(newValue);
    }
}
