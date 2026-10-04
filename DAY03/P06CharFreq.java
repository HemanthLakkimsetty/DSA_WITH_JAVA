import java.util.HashMap;

public class P06CharFreq {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm=new HashMap<>();
        String s = "programming";
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        characterFrequency(s);
        System.out.println(hm);
    }
    static void characterFrequency(String s){
        int[] ch=new int[26];
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
        if (ch[i] > 0) {
            System.out.println((char)('a' + i) + " - " + ch[i]);
        }
    }

    }
}
