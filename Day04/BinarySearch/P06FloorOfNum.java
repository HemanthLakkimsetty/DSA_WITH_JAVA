public class P06FloorOfNum {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        int tg=9;
        int num=-1;

        int i=0,j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==tg){
                num=arr[mid];
                break;
            }else if(arr[mid]<tg){
                i=mid+1;
                num=arr[mid];
            }else{
                j=mid-1;
            }
        }
        System.out.println(num);
    }
    
}
