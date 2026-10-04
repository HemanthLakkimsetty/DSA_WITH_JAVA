public class P04ValidPalindrome {
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        str=str.trim().toLowerCase().replaceAll("[^a-zA-Z]","");
        int i=0,j=str.length()-1;
        boolean isPalindrome=true;
        while(i<=j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else{
                isPalindrome=false;
                break;
            }
        }
        System.out.println(isPalindrome?"given str is palindrome":"given str is not a palindrome");
    }
    
}
