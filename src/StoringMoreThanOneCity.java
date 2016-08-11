import javax.swing.text.html.HTMLDocument;
import java.util.*;

/**
 * Created by kayabegum on 8/6/2016.
 */
public class StoringMoreThanOneCity {
    public static void main(String[] args) {
        List<String> CitiesInUSA=new ArrayList<String>();
        CitiesInUSA.add("NY");
        CitiesInUSA.add("MI");
        CitiesInUSA.add("LA");

        List<String> CitesInBangladesh=new ArrayList<String>();
        CitesInBangladesh.add("Sylhet");
        CitesInBangladesh.add("Dhaka");
        CitesInBangladesh.add("Comilla");

        List<String> CitiesInUK=new ArrayList<String>();
        CitiesInUK.add("London");
        CitiesInUK.add("Manchester");
        CitiesInUK.add("Bristol");

        Map<String,List<String>>map=new LinkedHashMap<String,List<String>>();
        map.put("USA",CitiesInUSA);
        map.put("Bangladesh",CitesInBangladesh);
        map.put("UK",CitiesInUK);

        for(Map.Entry<String,List<String>> entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("retrieving data using a while loop");

        Iterator it=map.entrySet().iterator();




    }
}
