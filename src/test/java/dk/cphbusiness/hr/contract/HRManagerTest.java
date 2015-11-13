package dk.cphbusiness.hr.contract;

import dk.cphbusiness.hr.contract.dto.DepartmentSummary;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class HRManagerTest {
  private HRManager manager;
  
  @Before
  public void setUp() {
    manager = HRManagerHolder.manager;
    }
  
  @Test
  public void testListDepartments() {
    Collection<DepartmentSummary> departments = manager.listDepartments();
    assertNotNull(departments);
    }
  
  }
