package dk.cphbusiness.hr.contract.dto;

import java.io.Serializable;

public class DepartmentIdentifier implements Serializable {
  private final String code;

  public DepartmentIdentifier(String code) {
    this.code = code;
    }
  
  public String getCode() { return code; }
  
  }
