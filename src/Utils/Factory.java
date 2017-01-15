package Utils;

import DAO.LiquidDAO;
import Entity.Liquid;

public class Factory {

    private static LiquidDAO liquidDAO;
    private static Factory instance = null;

    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public static void setLiquidDAO(Liquid liquid) {
        if (liquidDAO == null) {
            liquidDAO = new LiquidDAO();
        }
        liquidDAO.addLiquid(liquid);
    }
}
