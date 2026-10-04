public class P03StrScore {
    public static void main(String[] args) {
        String str="hello";
        int sum=0;
        for(int i=1;i<str.length();i++){
            int ch1=str.charAt(i-1);
            int ch2=str.charAt(i);
            sum=sum+(int)(Math.abs(ch1-ch2));
            System.out.println(sum);
        }
        System.out.println(sum);
    }
    
}
