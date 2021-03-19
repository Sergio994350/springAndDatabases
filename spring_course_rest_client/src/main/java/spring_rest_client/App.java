package spring_rest_client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_rest_client.configuration.MyConfig;
import spring_rest_client.entity.Employee;
import java.util.List;


public class App
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication",
                Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee employee = communication.getEmployee(1);
//        System.out.println(employee);

//        Employee employee = new Employee("Sveta", "Komarova", "IT", 700);
//        employee.setId(9);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(9);

    }
}
