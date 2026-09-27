public class Q2SecLargeEle {
    public static void main(String[] args) {
        int[] arr={1,23,4,5,4,64,768,23,9};
        int max=Integer.MIN_VALUE;
        int sec=max;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                sec=max;
                max=arr[i];
            }else if(arr[i]>sec && arr[i]!=max){
                sec=max;
            }
        }
        System.out.println(sec);
    }
}
