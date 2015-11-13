package dk.cphbusiness.hr.contract.dto;

public class DepartmentSummary extends DepartmentIdentifier {
  private final String description;

  public DepartmentSummary(String code, String description) {
    super(code);
    this.description = description;
    }

  public String getDescription() {
    return description;
    }
  
  }
