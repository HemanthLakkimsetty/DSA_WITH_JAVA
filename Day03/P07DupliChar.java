import java.util.HashMap;
import java.util.HashSet;
public class P07DupliChar {
    public static void main(String[] args) {
        //using hashset
        HashSet<Character>hs=new HashSet<>();
        String s="occurrences";
        for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i))){
                System.out.println(s.charAt(i));
            }
            hs.add(s.charAt(i));
        }
        System.out.println();
        duplicateCharacters01(s);
        duplicateCharacters02(s);
    }
    
    //using HashMap
    static void duplicateCharacters01(String s){
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }

        for(HashMap.Entry<Character,Integer> entry:hm.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
        //java 8+
        hm.forEach((key,value)->{
            if(value>1){
                System.out.println(key);
            }
        });
    }

    //using char array 
    static void duplicateCharacters02(String s){
        int[] chars=new int[26];
        for(int i=0;i<s.length();i++){
            chars[s.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(chars[i]>1){
                System.out.println((char)('a'+i));
            }
        }
    }
}
