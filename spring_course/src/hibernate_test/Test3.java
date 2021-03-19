package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {


        SessionFactory factory =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class)
                        .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            // пишем не имя таблицы в БД, а имя класса
//            List<Employee> emps = session.createQuery("from Employee").getResultList();
            // получим из таблицы всех работников с именем Alex ('Alex')
            List<Employee> emps = session.createQuery("from Employee where name = 'Oleg' " +
                    "and salary > 600").getResultList();

            for (Employee e : emps)
                System.out.println(e);


            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            factory.close();
        }


    }
}
