import java.util.*;
public class P011IsRotateMatEqual {
    public static void main(String[] args) {
        int[][] mat1={{0,1},{1,0}};
        int[][] mat2={{1,0},{0,1}};
        boolean isEqual=false;
        for(int i=0;i<4;i++){
            if(Arrays.deepEquals(mat1,mat2)){
                isEqual=true;
                break;
            }
            mat1=rotateMatrix(mat1);
        }
        System.out.println(isEqual?"Yes both Matrix are Equal with rotations":"No its not Equal");
    }

    static int[][] rotateMatrix(int[][] mat){
        int[][] revMat=new int[mat[0].length][mat.length];

        //transpose matrix
        for(int i=0;i<revMat.length;i++){
            for(int j=0;j<revMat[i].length;j++){
                revMat[i][j]=mat[j][i];
            }
        }

        //revese the rows of revMat
        for(int i=0;i<revMat.length;i++){
            int a=0,b=revMat[i].length-1;
            while(a<=b){
                //swap elements
                int temp=revMat[i][a];
                revMat[i][a]=revMat[i][b];
                revMat[i][b]=temp;
                a++;
                b--;
            }
        }
        return revMat;
    }
}
