import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by kayabegum on 8/6/2016.
 */
public class UseHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("Bangladesh", "Dhaka");
        map.put("USA", "New York");
        map.put("UK", "london");
        for (Map.Entry<String, String> entry : map.entrySet()) {

            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
