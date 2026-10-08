public class P09MinAndMaxValIn2D {
    public static void main(String[] args) {
        int[][] arr={{40, 50, 60},
                    {10, 20, 30},
                    {70, 80, 90}};

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                max=Math.max(max,arr[i][j]);
                min=Math.min(min,arr[i][j]);
            }
        }
        System.out.println(min+"\n"+max);
    }
    
}
