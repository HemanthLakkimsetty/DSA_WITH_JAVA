import java.util.Arrays;

public class P13StringRotationCheck {
    public static void main(String[] args) {
        //second string can be obtained by rotating the first string.
        String s1 = "abcd";
        String s2 = "cdab";
        String[] str1=s1.split("");
        String[] str2=s2.split("");
        Arrays.sort(str1);
        Arrays.sort(str2);
        System.out.println(Arrays.equals(str1,str2)?"BothEquals":"not Equals");
        //best solution according to me
        String str=s1+s2;
        System.out.println(str.contains(s2));

    }
    
}
