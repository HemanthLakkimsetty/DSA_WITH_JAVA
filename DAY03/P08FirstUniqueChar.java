import java.util.LinkedHashSet;

public class P08FirstUniqueChar {
    public static void main(String[] args) {
        String str="leetcode";
        //uisng LinkedHashSet
        LinkedHashSet<Character>lh=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            if(!lh.contains(str.charAt(i))){
                lh.add(str.charAt(i));
            }
        }
        for(char ch: lh){
            System.out.println(ch);
            break;
        }

        char ch=firstUniqueCharacter(str);
        System.out.println(ch);
    }

    //using arr with 26 size

    static char firstUniqueCharacter(String s){
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }

        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1){
                return s.charAt(i);
            }
        }
        return '0';
    }
    
}
