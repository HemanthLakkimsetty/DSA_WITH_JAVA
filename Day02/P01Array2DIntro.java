import java.util.Scanner;

class P01Array2dIntro{
    public static void main(String[] args) {
        // int[] [] arr2D={{1,2,3},
        //                 {4,5,6},
        //                 {7,8,9}};
        Scanner sc=new Scanner(System.in);
        int col=sc.nextInt();
        int row=sc.nextInt();
        int[][] arr2D=new int[col][row];
        for(int i=0;i<arr2D.length;i++){
            for(int j=0;j<arr2D[i].length;j++){
                arr2D[i][j]=sc.nextInt();
            }
            System.out.println();
        }


        for(int i=0;i<arr2D.length;i++){
            for(int j=0;j<arr2D[i].length;j++){
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
            sc.close();
        }
    }
}