package chat;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.sound.sampled.Line;

public class Direcciones {
//    public Map<String,String> m = new HashMap();
//    
//    public void saveInMap(String key, String ip){
//        m.put(key, ip);
//    }
//    
//    public Map<String,String>getMapa(){
//        m.put("Yo", "192.168.0.124");
//        m.put("LinuxMint", "127.0.8.1");
//        return m;
//    }
    
    public static Map<String,String>getMapa(){
        Map<String,String>map=new LinkedHashMap();
        map.put("Yo", "192.168.0.124");
        map.put("Anonimo", "192.168.0.6");
        return map;
    }
    
    
}
