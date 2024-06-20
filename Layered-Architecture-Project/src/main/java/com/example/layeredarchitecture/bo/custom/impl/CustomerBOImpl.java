
package com.example.layeredarchitecture.bo.custom.impl;

import com.example.layeredarchitecture.bo.custom.CustomerBO;
import com.example.layeredarchitecture.dao.DAOFactory;
import com.example.layeredarchitecture.dao.DAOTypes;
import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.entity.Customer;
import com.example.layeredarchitecture.dto.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getDAOFactory().getDAO(DAOTypes.CUSTOMERDAO);

    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException {
        ArrayList<Customer> customers = customerDAO.getAll();
        ArrayList<CustomerDTO> customerDTO = new ArrayList<>();

        for (Customer customer: customers){
            customerDTO.add(new CustomerDTO(customer.getId(),customer.getName(),customer.getAddress()));
        }
        return customerDTO;
    }


    public boolean saveCustomer(CustomerDTO customerDTO) throws Exception{
        return customerDAO.save(new Customer(customerDTO.getId(),customerDTO.getName(),customerDTO.getAddress()));
    }


    public boolean updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
        return customerDAO.update(new Customer(customerDTO.getId(),customerDTO.getName(),customerDTO.getAddress()));
    }


    public void deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        customerDAO.delete(id);
    }


    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.exist(id);
    }

    public String generateNewID() throws SQLException, ClassNotFoundException {
        return customerDAO.generateNewID();

    }

}
