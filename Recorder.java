import java.util.HashMap;
import java.util.Map;

public class Recorder {
    private Map<String, String> map = new HashMap<>();

    public void put(String key, String value) {
        map.put(key, value);
        System.out.println(key + "=" + value);
    }  

    public void get(String key) {
        if(!map.containsKey(key)) {
            throw new IllegalArgumentException();
        }
        System.out.println(map.get(key));
    }  

    public void delete(String key) {
        if(!map.containsKey(key)) {
            throw new IllegalArgumentException();
        }  
        map.remove(key);//何の役割？
        System.out.println("deleted:" + key);
    } 

    public void delete() {
        map.clear();//?
        System.out.println("deleted all");        
    }
}



/*

import java.util.Map;

public class Recorder {
    public static void main(String[] args) {
    Map<String, Integer> prefs = new HashMap<>();
    prefs.put("京都府", 255);
    prefs.put("東京都", 1261);
    prefs.put("熊本県", 181);
    int tokyo =  prefs.get("東京都");
    System.out.println("東京都" + "=" + tokyo);
    }
}*/