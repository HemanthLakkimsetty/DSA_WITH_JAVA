import java.util.HashSet;

public class P10ConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};

        //using hashset with tc of O(n*k) and sc of O(n)
        HashSet<Character> hs=new HashSet<>();
        for(char ch: allowed.toCharArray()){
            hs.add(ch);
        }
        //tc = O(n)
        for(String str:words){
            boolean isAllowed=true;
            //tc=O(k)
            for(char ch:str.toCharArray()){
                if(!hs.contains(ch)){
                    isAllowed=false;
                    break;
                }
            }
            if(isAllowed){
                System.out.println(str);
            }
        }
        System.out.println(countConsistentStrings(allowed, words));
    }
    //using character array and boolean array of tc is same but sc changes to O(1) if and only if all characters are in lowercase
    static int countConsistentStrings(String allowed, String[] words) {
        
        boolean[] arr=new boolean[26];

        for(char ch: allowed.toCharArray()){
            arr[ch-'a']=true;
        }

        int cnt=0;
        
        for(String str: words){

            boolean isAllowed=true;

            for(char ch:str.toCharArray()){
                if(!arr[ch-'a']){
                    isAllowed=false;
                    break;
                }
            }

            if(isAllowed){
            cnt++;
        }
        }
        return cnt;
    }
}
