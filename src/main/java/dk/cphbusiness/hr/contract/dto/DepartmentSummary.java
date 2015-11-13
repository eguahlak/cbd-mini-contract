package dk.cphbusiness.hr.contract.dto;

/**
 * aslkfjsdl 
 */
public class DepartmentSummary extends DepartmentIdentifier {
  private final String description;

  public DepartmentSummary(String code, String description) {
    super(code);
    this.description = description;
    }

  /**
   * Description of the department.
   * A description with enough information to choose between departments.
   * The description consists of the department name, and some other info.
   * @return the description of the department
   */
  public String getDescription() {
    return description;
    }
  
  }
