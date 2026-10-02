public class P10FlipImg {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
    
        matRev(arr);
        System.out.println(1^1);

    }

    static void matRev(int[][] arr){
        for(int i=0;i<arr.length;i++){
            int j=0;
            int k=arr[i].length-1;
            while(j<k){
                int temp=1^arr[i][j];
                arr[i][j]=1^arr[i][k];
                arr[i][k]=temp;
                j++;
                k--;
            }
        }
        for(int[] a: arr){
            for(int b: a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
