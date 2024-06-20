package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.dao.custom.impl.*;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {}

    public static DAOFactory getDAOFactory() {
        return daoFactory == null ? daoFactory= new DAOFactory() : daoFactory;
    }

    public SuperDAO getDAO(DAOTypes daoTypes){

        switch (daoTypes){
            case ITEMDAO:
                return  new ItemDAOImpl();

            case ORDERDAO:
                return  new OrderDAOImpl();

            case CUSTOMERDAO:
                return  new CustomerDAOImpl();

            case ORDERDETAILSDAO:
                return new OrderDetailsDAOImpl();

            case QUERY:
                return new QueryDAOImpl();

            default:
                return null;
        }
    }
}
