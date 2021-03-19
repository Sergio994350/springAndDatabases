package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {


        SessionFactory factory =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class)
                        .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Alex", "Smirnov", "IT", 600);

            // открыть сессию
            session.beginTransaction();

            // сохранить объект в БД
            session.save(emp);

            // закрыть транзакцию
            session.getTransaction().commit();

            System.out.println(emp);

        } finally {
            factory.close();
        }


    }
}
