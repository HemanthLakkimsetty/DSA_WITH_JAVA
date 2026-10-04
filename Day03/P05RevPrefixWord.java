public class P05RevPrefixWord {
    public static void main(String[] args) {
        String str="abcdefd";
        int idx=-1;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='d'){
                idx=i;
                break;
            }
        }

        char[] ch=str.toCharArray();
        int s=0,e=idx;
        while(s<=e){
            char c=ch[s];
            ch[s]=ch[e];
            ch[e]=c;
            s++;
            e--;
        }
        System.out.println(new String(ch));
    }
    //using stringbuilder
    static String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        int idx=-1;

        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            return word;
        }
        sb.append(word.substring(0,idx+1)).reverse().append(word.substring(idx+1,word.length()));
        return sb.toString();

    }
}
