package strategypattern.entity;
import java.util.Map;

import strategypattern.auth.AuthenticationInterface;
import strategypattern.auth.DefaultAuth;
public class Employee {
    
    AuthenticationInterface authentication= new DefaultAuth();

    String employeeId;

    public AuthenticationInterface getAuthentication() {
        return authentication;
    }

    public void setAuthentication(AuthenticationInterface authentication) {
        this.authentication = authentication;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Map<String,Boolean> performAuth(){
        return this.authentication.getAuth();
    }


    public Employee(AuthenticationInterface authentication, String employeeId) {
        this.authentication = authentication;
        this.employeeId = employeeId;
    }
    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }




    
}
