public class P09TarnsposeMat {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
        
        //transposing matrix --> b[i][j]=a[j][i]

        int[][] transMat=new int[arr[0].length][arr.length];
        for(int i=0;i<transMat.length;i++){
            for(int j=0;j<transMat[i].length;j++){
                transMat[i][j]=arr[j][i];
            }
        }

        for(int[] i: transMat){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    
}
