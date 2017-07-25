package TestHibernate.HibernateFirstProgram;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        Alien a = new Alien();
        a.setAid(101);
        a.setAname("Alien1");
        a.setColor("Blue");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession(); //gives the object of Session
        
        //All changes should be part of transaction
        session.beginTransaction();
        session.save(a);
        session.getTransaction().commit();
        session.close();
		

    }
}
