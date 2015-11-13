package dk.cphbusiness.hr.contract.dto;

import java.io.Serializable;

public class EmployeeIdentifier implements Serializable {
  private final long id;

  public EmployeeIdentifier(long id) {
    this.id = id;
    }

  public long getId() { return id; }

  }
