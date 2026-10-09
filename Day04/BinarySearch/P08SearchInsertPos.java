public class P08SearchInsertPos {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int tg=4;
        int idx=-1,i=0,j=arr.length-1;

        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==tg){
                idx=mid;
            }else if(arr[mid]<tg){
                i=mid+1;
            }else {
                j=mid-1;
                idx=mid;
            }
        }
        System.out.println(idx);
    }
    
}
