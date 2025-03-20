package strategypattern.entity;
import strategypattern.auth.AuthenticationInterface;
import strategypattern.auth.ShopAuth;

public class Manager extends Employee {


    public Manager(String employeeId) {
        super(new ShopAuth(), employeeId);
    }
    public AuthenticationInterface getAuthentication() {
        return authentication;
    }

    public void setAuthentication(AuthenticationInterface authentication) {
        this.authentication = authentication;
    }
    


    
}
