package spring.springboot_rest.dao;

//import org.hibernate.Session;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.springboot_rest.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    // метод для получения списка всех работников
    @Override
    public List<Employee> getAllEmployees() {
        // используем Hibernate
//        Session session = entityManager.unwrap(Session.class);
//        Query<Employee> query = session.createQuery("from Employee", Employee.class);
//        List<Employee> allEmployees = query.getResultList();

        // используем JPA методы
        Query query = entityManager.createQuery("from Employee");
        List<Employee> allEmployees = query.getResultList();

        return allEmployees;
    }

    // метод для сохранения или изменения работника
    @Override
    public void saveEmployee(Employee employee) {

        // используем Hibernate
//        Session session = entityManager.unwrap(Session.class);
//        session.saveOrUpdate(employee);

        // используем JPA методы
        Employee newEmployee = entityManager.merge(employee);
        employee.setId(newEmployee.getId());


    }

    // метод для получения работника по его id
    @Override
    public Employee getEmployee(int id) {

        // используем Hibernate
//        Session session = entityManager.unwrap(Session.class);
//        Employee employee = session.get(Employee.class, id);

        // используем JPA методы
        Employee employee = entityManager.find(Employee.class, id);

        return employee;
    }

    // метод для удаления работника по его id
    @Override
    public void deleteEmployee(int id) {

        // используем Hibernate
//        Session session = entityManager.unwrap(Session.class);
//        Query<Employee> query = session.createQuery("delete from Employee "
//                + "where id=:employeeId");
//        query.setParameter("employeeId", id);
//        query.executeUpdate();

        // используем JPA методы
        Query query = entityManager.createQuery("delete from Employee "
                + "where id=:employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }


}
