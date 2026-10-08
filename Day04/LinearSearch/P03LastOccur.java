public class P03LastOccur {
    public static void main(String[] args) {
        int[] arr={4, 7, 2, 7, 9, 7};
        int tar=7;
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                idx=i;
            }
        }
        System.out.println("LAst occur:"+idx);
    }
}
