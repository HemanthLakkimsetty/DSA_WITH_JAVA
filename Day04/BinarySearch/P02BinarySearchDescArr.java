public class P02BinarySearchDescArr {
    public static void main(String[] args) {
        int[] arr={20, 18, 15, 12, 10, 8, 5};
        int tg=12;

        int i=0,j=arr.length-1,idx=-1;

        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==tg){
                idx=mid;
                break;
            }else if(arr[mid]<tg){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        System.out.println(idx);
    }
    
}
