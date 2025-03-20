package strategypattern.auth;

import java.util.HashMap;
import java.util.Map;

public class DefaultAuth implements AuthenticationInterface{
    
    public  Map<String,Boolean> authMap = new HashMap<>();

    @Override
    public Map<String,Boolean> getAuth(){
        authMap.put("room",false);
        authMap.put("shop",false);
        return authMap;
    }
}
