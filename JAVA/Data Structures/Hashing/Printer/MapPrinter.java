import java.util.HashMap;
import java.util.Map;

public class MapPrinter<K,V>{
    public void PrintTheMap(HashMap<K,V> MapInput){
        System.out.println("Values Inside The Map: ");
        for(Map.Entry<K,V> value: MapInput.entrySet()){
            System.out.println(value.getKey()+" "+value.getValue());
        }
    }
}
