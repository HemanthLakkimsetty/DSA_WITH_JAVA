public class Q3IsArrSort {
    public static void main(String[] args) {
        int[] arr={1,23,4,5,4,64,768,23,9};
        boolean isArrSort=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<=arr[i]){
                continue;
            }else{
                isArrSort=false;
                break;
            }
        }

        if(isArrSort){
            System.out.println("Arr is sorted"+ arr);
        }else{
            System.out.println("Arr is not sorted "+arr);
        }
    }
}
