public class P07MaxValue {
    public static void main(String[] args) {
        int[] arr={18, 5, 27, 3, 14};
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
}
