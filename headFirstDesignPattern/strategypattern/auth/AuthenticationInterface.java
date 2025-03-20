package strategypattern.auth;
import java.util.Map;

public interface AuthenticationInterface {
    

    public abstract Map<String,Boolean> getAuth();


}
