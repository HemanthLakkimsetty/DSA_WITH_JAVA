public class P03RowAndColSum {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        
        
        //row sum and normal traversal
        for(int i=0;i<arr.length;i++){
            int rowSum=0;
            for(int j=0;j<arr[i].length;j++){
                rowSum+=arr[i][j];
            }
            System.out.println(rowSum);
        }
        System.out.println();
        //col sum and reverse the inner outer loo traversal

        for(int j=0;j<arr[0].length;j++){
            int colSum=0;
            for(int i=0;i<arr.length;i++){
                colSum+=arr[i][j];
            }
            System.out.println(colSum);
        }
    }
    
}
