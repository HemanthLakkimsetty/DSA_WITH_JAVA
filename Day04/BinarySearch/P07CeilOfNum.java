public class P07CeilOfNum {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        int tg=7;

        int i=0,j=arr.length-1,num=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==tg){
                num=mid;
                break;
            }else if(arr[mid]<tg){
                i=mid+1;
            }else {
                num=arr[mid];
                j=mid-1;
                
            }
        }
        System.out.println(num);
    }
    
}
