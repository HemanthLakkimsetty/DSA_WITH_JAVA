public class P15CreateSpiralMat {
    public static void main(String[] args) {
        int n=3;
        int[][] arr=new int[n][n];

        int colBeg=0;
        int colEnd=n-1;
        int rowBeg=0;
        int rowEnd=n-1;
        int val=1;
        while(colBeg<=colEnd && rowBeg<=rowEnd){
            //moving right side
            for(int j=colBeg;j<=colEnd;j++){
                arr[rowBeg][j]=val++;
            }
            rowBeg++;
            //moving up to down
            for(int j=rowBeg;j<=rowEnd;j++){
                arr[j][colEnd]=val++;
            }
            colEnd--;
            //moving right to left
            if(rowBeg<=rowEnd){
                for(int j=colEnd;j>=colBeg;j--){
                    arr[rowEnd][j]=val++;
                }
            }
            rowEnd--;
            //moving down to up
            if(colBeg<=colEnd){
                for(int j=rowEnd;j>=rowBeg;j--){
                    arr[j][colBeg]=val++;
                }
            }
            colBeg++;
        }
        for(int[] i: arr){
                for(int j: i){
                    System.out.print(j+" ");
                }
            }
    }
}
