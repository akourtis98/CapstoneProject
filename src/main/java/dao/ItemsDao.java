package dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import database.Products;
import org.hibernate.cfg.AnnotationConfiguration;

@Repository
public class ItemsDao {
     public List<Products> getAllProducts() {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Query query = session.createQuery(" from Products ");

        List<Products> productList = query.list();
        

        return productList;
    }
}
