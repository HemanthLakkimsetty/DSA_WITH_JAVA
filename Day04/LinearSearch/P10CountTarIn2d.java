public class P10CountTarIn2d {
    public static void main(String[] args) {
        int[][] arr={{2, 5, 2},
                    {8, 2, 9},
                    {2, 4, 7}};

        int tar=2;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==tar){
                    cnt++;
                }
            }
        }
        System.out.println("No of Ocurr: "+cnt);
    }
    
}
