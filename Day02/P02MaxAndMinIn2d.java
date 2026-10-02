public class P02MaxAndMinIn2d {
    public static void main(String[] args) {
        int[][] arr={{10,5,8},
                    {2,15,6},
                    {9,3,12}};

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                max=Math.max(max,arr[i][j]);
                min=Math.min(min,arr[i][j]);
            }
        }
        System.out.println("MIN VAL:"+min+"\n"+"MAX VAL:"+max);
    }
    
}
