public class P06MatMul {
    public static void main(String[] args) {
        int[][] arr1={{1,2},{3,4}};
        int[][] arr2={{5,6},{7,8}};

        int[][] mulMat=new int[arr1.length][arr2[0].length];
        //mul Mat-->c[i][j]+=a[i][k]*b[k][j]
        // i → selects the row of a
        // j → selects the column of b
        // k → moves across the row of a and down the column of b
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                for(int k=0;k<arr2.length;k++){
                    mulMat[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }

        for(int[] i:mulMat){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
