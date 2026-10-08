public class P06MinVal {
    public static void main(String[] args) {
        int[] arr={18, 5, 27, 3, 14};
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        System.out.println(min);
    }
    
}
