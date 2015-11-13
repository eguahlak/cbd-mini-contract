package dk.cphbusiness.hr.contract;

import dk.cphbusiness.hr.contract.dto.DepartmentIdentifier;
import dk.cphbusiness.hr.contract.dto.DepartmentSummary;
import dk.cphbusiness.hr.contract.dto.EmployeeDetail;
import dk.cphbusiness.hr.contract.eto.IllegalEmployeeException;
import java.util.Collection;

public interface HRManager {
  /**
   * List all departments.
   * List all departments in the system, jkdfls fkldsf sdlk.
   * 
   * <br></br>Preconditions: none
   * <br></br>Postconditions: none
   * 
   * @return A collection of departments
   */
  Collection<DepartmentSummary> listDepartments();
  
  /**
   * Create a new employee.
   * Create an employee in a specified department.
   * 
   * <br></br>Preconditions:
   *    Department exists.
   * <br></br>Postconditions: 
   *    Either the employee is created with the given department or no employee is created. 
   * 
   * @param department an identifier of an existing department.
   * @param employee details about the employee to create.
   * 
   * @throws IllegalEmployeeException when employee cannot be created.
   * @throws NullPointerException if department or employee is null.
   */
  void createEmployee(
      DepartmentIdentifier department,
      EmployeeDetail employee
      ) throws IllegalEmployeeException;
  }
