public class P08SearchIn2d {
    public static void main(String[] args) {
        int[][] arr={{10, 20, 30},
                    {40, 50, 60},
                    {70, 80, 90}};

        int tar=50;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==tar){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    
}
