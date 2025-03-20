package strategypattern.auth;
import java.util.HashMap;
import java.util.Map;

public class RoomAuth implements AuthenticationInterface{
    
    public Map<String,Boolean> authMap = new HashMap<>();
    @Override
    public Map<String,Boolean> getAuth(){

        authMap.put("room",true);
        authMap.put("shop",false);
        return authMap;


    }
}