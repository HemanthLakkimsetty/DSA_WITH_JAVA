public class P04LastOcc {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,4};
        int tg=2;

        int i=0,j=arr.length-1,idx=-1;

        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==tg){
                idx=mid;
                i=mid+1;
            }else if(arr[mid]<tg){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        System.out.println(idx);
    }
    
}
