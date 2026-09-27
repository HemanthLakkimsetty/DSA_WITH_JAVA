public class Q9MissNum {
    public static void main(String[] args) {
        int[] arr = {0,1, 2, 3, 5};
        //only works for 0-->n only
        int n=0;
        for(int i=0;i<arr.length;i++){
            n^=i+1;
            n^=arr[i];
        }
        //only works for 1-->n
        int n2=0;
        for(int i=0;i<arr.length;i++){
            n2^=i+1;
            n2^=arr[i];
        }
        
        //works for any but used math
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int n3=arr.length;
        int miss=n3*(n3+1)/2;
        System.out.println(miss-sum);

        System.out.println(n+"--"+n2);
    }
    
}
