public class P19prefixWordInSentence {
    public static void main(String[] args) {
        String str="i love eating burger" ;
        String searchWord = "burg";

        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].startsWith(searchWord)){
                System.out.println(arr[i]+" indexed at: "+i);
                break;
            }
        }
    }
    
}
