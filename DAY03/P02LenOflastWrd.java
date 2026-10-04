public class P02LenOflastWrd {
    public static void main(String[] args) {
        String str="Hello World".trim();
        int cnt=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                break;
            }else{
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    
}
