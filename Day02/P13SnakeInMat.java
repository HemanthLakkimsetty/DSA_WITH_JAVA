public class P13SnakeInMat {
    public static void main(String[] args) {
        String[] arr={"DOWN","RIGHT","UP"};
        int n=3;

        int col=0;
        int row=0;
        for(String s: arr){
            if(s.equals("RIGHT")){
                col++;
            }else if(s.equals("LEFT")){
                col--;
            }else if(s.equals("DOWN")){
                row++;
            }else if(s.equals("UP")){
                row--;
            }
        }
        System.out.println(row*n+col);
    }
}
