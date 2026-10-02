public class P07DiagonalSum {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int diaSum=0;
        //O(n)-->c+=a[i][i]+a[i][length(arr)-1-i]
        
        for(int i=0;i<arr.length;i++){
            diaSum+=arr[i][i];
            diaSum+=arr[i][arr.length-1-i];
        }
        System.out.println(diaSum-arr[arr.length/2][arr.length/2]);
    }
    
}
