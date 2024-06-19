package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.OrderDAO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDAOImpl;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderBOImpl {
    OrderDAO orderDAO = new OrderDAOImpl();
    public ArrayList<OrderDTO> getAllOrder() throws SQLException, ClassNotFoundException {
        return orderDAO.getAll();
    }


    public boolean saveOrder(OrderDTO orderDTO) throws Exception{
        return orderDAO.save(orderDTO);
    }


    public boolean updateOrder(OrderDTO orderDTO) throws SQLException, ClassNotFoundException {
        return orderDAO.update(orderDTO);
    }


    public void deleteOrder(String id) throws SQLException, ClassNotFoundException {
        orderDAO.delete(id);
    }


    public boolean existOrder(String id) throws SQLException, ClassNotFoundException {
        return orderDAO.exist(id);
    }

    public String generateNewID() throws SQLException, ClassNotFoundException {
        return orderDAO.generateNewID();

    }


    public ArrayList<OrderDTO> getAllOrderIds() throws SQLException, ClassNotFoundException {
        return orderDAO.getAll();
    }


    public OrderDTO searchOrder(String newValue) throws SQLException, ClassNotFoundException {
        return orderDAO.search(newValue);
    }
}
