package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class OrderDetailDAOImpl implements OrderDetailDAO{

    @Override
    public int saveOrderDetail(List<OrderDetailDTO> orderDetailDTO, String orderId) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO OrderDetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)");

        for(OrderDetailDTO orderDetail:orderDetailDTO) {
            pstm.setString(1, orderId);
            pstm.setString(2, orderDetail.getItemCode());
            pstm.setBigDecimal(3, orderDetail.getUnitPrice());
            pstm.setInt(4, orderDetail.getQty());
        }

        return pstm.executeUpdate();
    }
}
