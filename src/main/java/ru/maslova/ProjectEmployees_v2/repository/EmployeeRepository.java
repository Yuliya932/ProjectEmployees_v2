package ru.maslova.ProjectEmployees_v2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maslova.ProjectEmployees_v2.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
