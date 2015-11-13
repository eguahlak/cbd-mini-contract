package dk.cphbusiness.hr.contract;

import dk.cphbusiness.hr.contract.dto.DepartmentIdentifier;
import dk.cphbusiness.hr.contract.dto.DepartmentSummary;
import dk.cphbusiness.hr.contract.dto.EmployeeDetail;
import dk.cphbusiness.hr.contract.eto.IllegalEmployeeException;
import java.util.Collection;

public interface HRManager {
  Collection<DepartmentSummary> listDepartments();
  void createEmployee(
      DepartmentIdentifier department,
      EmployeeDetail employee
      ) throws IllegalEmployeeException;
  }
