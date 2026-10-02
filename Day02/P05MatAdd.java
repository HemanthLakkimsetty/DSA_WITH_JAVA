public class P05MatAdd {
    public static void main(String[] args) {
        int[][] arr1={{1,2},{3,4}};
        int[][] arr2={{5,6},{7,8}};

        int[][] sumArr=new int[arr1.length][arr1[1].length];
        //matrix addtion c[i][j]=a[i][j]+b[i][j]
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[1].length;j++){
                sumArr[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        //for each loop on 2d arr
        for(int[] i:sumArr ){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
