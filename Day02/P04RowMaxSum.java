public class P04RowMaxSum {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{10,5,2},{4,6,1}};
        int maxRowSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int rowSum=0;
            for(int j=0;j<arr[i].length;j++){
                rowSum+=arr[i][j];
            }
            maxRowSum=Math.max(maxRowSum,rowSum);
        }
        System.out.print(maxRowSum);
    }
    
}
