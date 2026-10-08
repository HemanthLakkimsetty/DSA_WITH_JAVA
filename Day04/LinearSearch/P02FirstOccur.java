public class P02FirstOccur {
    public static void main(String[] args) {
        int[] arr={4, 7, 2, 7, 9, 7};
        int tar=7;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                System.out.println("First idx:"+i);
                break;
            }
        }
    }
    
}
