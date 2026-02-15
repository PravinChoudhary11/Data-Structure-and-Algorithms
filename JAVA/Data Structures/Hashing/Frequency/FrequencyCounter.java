import java.util.HashMap;

public class FrequencyCounter{
    public  HashMap<Character,Integer> CountApperence(String input){
        if(input==null) return null;
        HashMap<Character,Integer> Frequency = new HashMap<>();
        for(int i=0;i<input.length();i++){
            if(Frequency.containsKey(input.charAt(i))){
                Frequency.put(input.charAt(i),Frequency.get(input.charAt(i))+1);
            }else if(input.charAt(i) != ' '){
                Frequency.put(input.charAt(i),1);
            }
        }
        return Frequency;
    }
}
