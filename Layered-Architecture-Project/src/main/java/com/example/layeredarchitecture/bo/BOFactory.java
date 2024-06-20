package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.bo.custom.impl.CustomerBOImpl;
import com.example.layeredarchitecture.bo.custom.impl.ItemBOImpl;
import com.example.layeredarchitecture.bo.custom.impl.PurchaseOrderBOImpl;
import com.example.layeredarchitecture.bo.custom.impl.QueryBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {}

    public static BOFactory getBOFactory() {
        return boFactory == null ? boFactory = new BOFactory() : boFactory;
    }

    public enum BOTypes{
        ITEMBO,CUSTOMERBO,PLACEORDERBO,QUERYBO
    }

    public SuperBO getBO(BOTypes boTypes){

        switch (boTypes){
            case ITEMBO:
                return new ItemBOImpl();
            case PLACEORDERBO:
                return new PurchaseOrderBOImpl();
            case CUSTOMERBO:
                return new CustomerBOImpl();
            case QUERYBO:
                return new QueryBOImpl();

            default:
                return null;
        }
    }


}
