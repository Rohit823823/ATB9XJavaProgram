package Nov.ex_22112024;
import java.util.Map;
import java.util.HashMap;
public class Lab_218 {
    public static void main(String[] args) {
        //Map<String,Integer> map = new HashMap<String,Integer>();
        //Map<String,Integer> map = new HashMap<>();
        //Map map = new HashMap();
        Map<String,Integer> map = new HashMap<>();
        map.put("id",1);
        map.put("id",2);
        map.put("id2",2);
        map.put("id3",34);
        map.put("id4",34);
        map.put("id5",null);
        map.put("id6",null);
        map.put("null",102);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsValue(102));
        System.out.println(map.containsKey("id2"));

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.get("id4"));



    }
}
