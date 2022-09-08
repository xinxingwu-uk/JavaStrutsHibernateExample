package com.kang.db;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    public static final ThreadLocal session = new ThreadLocal();
    static {
        try {
            // ���������ļ�hibernate.cfg.xml����SessionFactory
        	Configuration configuration = new Configuration().configure();
    		ServiceRegistry serviceRegistry = 
    				new ServiceRegistryBuilder().applySettings(configuration.getProperties())
    				                            .buildServiceRegistry();
    		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            System.out.println("��ʼ��SessionFactory�ɹ���");
        } catch (Throwable ex) {
        	System.err.println("��ʼ��SessionFactoryʧ�ܡ�" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static Session getSession() {
    	Session s = (Session) session.get();
        // ���һ���µ�Session
        if (s == null) {
          s = sessionFactory.openSession();
          session.set(s);
        }
        return s;
    }
}
