package spring_data_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findAllByName(String name);


}
