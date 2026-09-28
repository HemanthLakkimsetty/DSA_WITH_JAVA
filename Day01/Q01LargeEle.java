public class Q1LargeEle{
    public static void main(String[] args) {
        int[] arr={1,23,4,5,4,64,768,23,9};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
}