public class P14SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        //output : 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16
        int colBeg=0,colEnd=arr[0].length-1;
        int rowBeg=0,rowEnd=arr.length-1;

        while(rowBeg<=rowEnd && colBeg<=colEnd){
            //left ---> right
            for(int j=colBeg;j<=colEnd;j++){
                System.out.print(arr[rowBeg][j]+" ");
            }
            rowBeg++;
            //up ---> down
            for(int j=rowBeg;j<=rowEnd;j++){
                System.out.print(arr[j][colEnd]+" ");
            }
            colEnd--;
            //right ---> left
            //if condition --- prevention ArrayIndexOutOfBoundException
            if(rowBeg<=rowEnd){
                for(int j=colEnd;j>=colBeg;j--){
                    System.out.print(arr[rowEnd][j]+" ");
                }
            }
            rowEnd--;
            //down ---> up
            //if condition --- prevention ArrayIndexOutOfBoundException
            if(colBeg<=colEnd){
                for(int j=rowEnd;j>=rowBeg;j--){
                    System.out.print(arr[j][colBeg]+" ");
                }
            }
            colBeg++;
        }
    }
}
