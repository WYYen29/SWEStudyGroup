package strategypattern.auth;
import java.util.HashMap;
import java.util.Map;

public class AllAuth implements AuthenticationInterface{
    
    @Override
    public Map<String,Boolean> getAuth(){
        Map<String, Boolean> authMap = new HashMap<>();
        authMap.put("room",true);
        authMap.put("shop",true);
        return authMap;
    }
}
