package dk.cphbusiness.hr.contract.dto;

public class EmployeeDetail extends EmployeeIdentifier {
  private String firstName;
  private String lastName;
  private long salary;
  private String email;

  public EmployeeDetail(
      long id, 
      String firstName,
      String lastName,
      long salary,
      String email
      ) {
    super(id);
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.email = email;
    }

  public String getFirstName() { return firstName; }
  public void setFirstName(String value) { firstName = value; }
  
  public String getLastName() { return lastName; }
  public void setLastName(String value) { lastName = value; }
  
  public long getSalary() { return salary; }
  public void setSalary(long value) { salary = value; }
  
  public String getEmail() { return email; }
  public void setEmail(String value) { email = value; }
  
  }
