package strategypattern.entity;
import strategypattern.auth.AuthenticationInterface;
import strategypattern.auth.ShopAuth;

public class Manager extends Employee {


    public Manager(String employeeId) {
        super(new ShopAuth(), employeeId); // ✅ 直接傳遞 ShopAuth，避免變數遮蔽
    }
    public AuthenticationInterface getAuthentication() {
        return authentication;
    }

    public void setAuthentication(AuthenticationInterface authentication) {
        this.authentication = authentication;
    }
    


    
}
