package model;

import java.util.Objects;

public class EmployeeModel {

  private String username;
  private String password;

  public EmployeeModel(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public String setUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String setPassword() {
    return password;
  }

  @Override
  public String toString() {
    return "EmployeeModel{"
        + "username='"
        + username
        + '\''
        + ", password='"
        + password
        + '\''
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EmployeeModel that = (EmployeeModel) o;
    return Objects.equals(username, that.username) && Objects.equals(password, that.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }
}
