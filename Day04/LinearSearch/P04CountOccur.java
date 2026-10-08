public class P04CountOccur {
    public static void main(String[] args) {
        int[] arr={2, 5, 2, 8, 2, 9, 2};
        int tar=2;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                cnt+=1;
            }
        }
        System.out.println(cnt);
    }
    
}
