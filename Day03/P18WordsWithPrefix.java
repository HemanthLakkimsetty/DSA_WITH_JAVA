public class P18WordsWithPrefix {
    public static void main(String[] args) {
        String[] words={"pay","attention","practice","attend"};
        String pref = "at";
        int cnt=0;
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pref)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    
}
