package Nov.ex_22112024;
import java.util.Map;
import java.util.HashMap;
public class Lab_220 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        map.put("id",1);
        map.put("id2",2);
        map.put("id3",34);
        map.put("id4",null);
        map.put("id5",null);
        map.put(null,100);

        //Iterate
        for (Map.Entry<String,Integer>Items: map.entrySet()){
            System.out.println(Items.getKey() + " -> "+ Items.getValue());
        }

    }
}
