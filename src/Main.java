import Entity.Liquid;
import Utils.Factory;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Map;

public class Main {

    public static void main(final String[] args) throws Exception {
        Factory.setLiquidDAO(new Liquid("atmose", 30));
    }
}