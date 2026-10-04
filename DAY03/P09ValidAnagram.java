import java.util.Arrays;

public class P09ValidAnagram {
    public static void main(String[] args) {
        String str1="anagram";
        String str2="nagaram";

        //using arrays inbuilt function with tc of O(n log n) sc of O(n)
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1,ch2)?"Both Strings are Anagrams":"Not anagrams");

        if(validAnagrams(str1, str2)){
            System.out.println("Both Given Strings are Anagrams");
        }else{
            System.out.println("Both Strings are not Anagrams");
        }
    }

    //using character arrays with tc of o(n) sc of(1) for lowercases alphas only
    static boolean validAnagrams(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        int[] arr=new int[26];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }

        for(int i: arr){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
    
}
