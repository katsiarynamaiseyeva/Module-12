package model;

public class UserFactory {

    public static EmployeeModel createUser(String username, String password){

      return new EmployeeModel(username, password);
    }
}
