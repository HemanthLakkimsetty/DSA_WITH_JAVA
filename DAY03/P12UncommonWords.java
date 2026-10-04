import java.util.ArrayList;
import java.util.HashMap;

public class P12UncommonWords {
    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        //i have found only one common solution with efficient tc : using HashMap
        HashMap<String,Integer>hm=new HashMap<>();
        ArrayList<String>al=new ArrayList<>();

        for(String s:s1.split(" ")){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        for(String s:s2.split(" ")){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }

        for(HashMap.Entry<String,Integer>entry:hm.entrySet()){
            if(entry.getValue()==1){
                al.add(entry.getKey());
            }
        }
        System.out.println(al);
    }

}
