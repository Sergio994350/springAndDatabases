package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {


        SessionFactory factory =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class)
                        .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            // установим salary для объекта с определнным id
//            Employee emp = session.get(Employee.class, 1);
//            emp.setSalary(1500);

            // установим salary для всех объектов с определенным именем
            session.createQuery("update Employee set salary = 1000 where name = 'Oleg'").executeUpdate();


            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            factory.close();
        }


    }
}
