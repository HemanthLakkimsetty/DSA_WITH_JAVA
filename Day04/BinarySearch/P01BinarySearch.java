class P01BinarySearch{
    public static void main(String[] args){
        int[] arr={2, 4, 6, 8, 10, 12, 14};
        int tg=10;
        int idx=-1;

        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==tg){
                idx=mid;
                break;
            }else if(arr[mid]<tg){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        System.out.println(idx);
    }
}