public class P01RevStr {
    public static void main(String[] args) {
        char[] str={'h','e','l','l','o'};
        int i=0,j=str.length-1;
        while(i<=j){
            char ch=str[i];
            str[i]=str[j];
            str[j]=ch;
            i++;
            j--;
        }
        for(char ch: str){
            System.out.print(ch+" ");
        }
    }
}
