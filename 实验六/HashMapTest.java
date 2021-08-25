import java.util.*;

public class HashMapTest {
    static Map str_stats(String s){
        String str=s.toLowerCase();
        char[] chs=str.toCharArray();
        Map<Character,Integer> hm=new HashMap<Character, Integer>();
        for(char c:chs){
            hm.put(c,0);
        }
        for(char c:chs){
            hm.put(c,hm.get(c)+1);
        }
        return hm;
    }
    public static void main(String args[]){
        Map<Character,Integer> hm=str_stats("Our country is an unity composed of 56 ethnic groups");
        Iterator<Map.Entry<Character,Integer>> it=hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Character,Integer> obj=it.next();
            Character key=obj.getKey();
            Integer value=obj.getValue();
            System.out.println(key+":"+value);
        }
    }
}
