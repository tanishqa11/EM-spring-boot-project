package com.tanishqagarg.em_project;
import java.util.*;

import org.springframework.stereotype.Service;


public interface EmployeeService {
    String CreateEmployee(Employee employee);
    List<Employee> ReadEmployees();
    boolean deleteEmployee(Long id);


}
