public class P05CountOcc {
    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,4};
        int tg=1;
        int fIdx=getFirstOccurance(arr,tg);
        int lIdx=getLastOccurance(arr, tg);
        System.out.println((fIdx==-1 && lIdx==-1)?"never exist in arr":lIdx-fIdx +1);
    }
    static int getFirstOccurance(int[] arr,int tg){
        int i=0,j=arr.length-1,idx=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==tg){
                idx=mid;
                j=mid-1;
            }else if(arr[mid]<tg){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return idx;
    }
    
    static int getLastOccurance(int[] arr,int tg){
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
        return idx;
    }
}
