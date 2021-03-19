package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {

    public static void main(String[] args) {

        SessionFactory factory =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Child.class)
                        .addAnnotatedClass(Section.class)
                        .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("football");
//            Child child1 = new Child("Sergey", 5);
//            Child child2 = new Child("Olya", 7);
//            Child child3 = new Child("Gleb", 6);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
// *************************************************************
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("volleyball");
//            Section section2 = new Section("chess");
//            Section section3 = new Section("math");
//
//            Child child1 = new Child("Igor", 10);
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
// *************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Section section = session.get(Section.class, 1);
//
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
// *************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 4);
//
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
// *************************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
// *************************************************************
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("dance");
//            Child child1 = new Child("Elena", 12);
//            Child child2 = new Child("Grisha", 10);
//            Child child3 = new Child("Sveta", 11);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
// *************************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 5);
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
// *************************************************************
            session = factory.getCurrentSession();
            session.beginTransaction();

            Child child = session.get(Child.class, 5);
            session.delete(child);

            session.getTransaction().commit();
            System.out.println("Done!");
// *************************************************************
        } finally {
            session.close();
            factory.close();
        }
    }
}
