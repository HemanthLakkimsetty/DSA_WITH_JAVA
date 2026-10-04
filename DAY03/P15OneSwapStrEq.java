public class P15OneSwapStrEq {
    public static void main(String[] args) {
        String s1="hemanth";
        String s2="hemanth";
        int cnt=0;
        int i=-1;
        int j=-1;
        for(int a=0;a<s1.length();a++){
            if(s1.charAt(a)!=s2.charAt(a)){
                cnt++;
                if(i==-1){
                    i=a;
                }else{
                    j=a;
                }
            }
        }
        if(cnt==0){
            System.out.println("Both are equal without swap");
        }
        if(cnt>2){
            System.out.println("need more than 1 swap and cant gerente even both are equal");
        }

        if(cnt==2){
            if(s1.charAt(i)==s2.charAt(j)||s2.charAt(i)==s1.charAt(j)){
                System.out.println("Can be Equal with 1 swap");
            }
        }
    }
}
