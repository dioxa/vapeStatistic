package DAO;

import Entity.Liquid;
import Utils.SessionUtil;
import org.hibernate.Session;

import javax.swing.*;

public class LiquidDAO {

    public void addLiquid (Liquid liqud) {
        Session session = null;
        try {
            session = SessionUtil.getSession();
            session.beginTransaction();
            session.save(liqud);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {

                session.close();
            }
        }
    }
}
