public class Q7RotateArrByK {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=3;
        rotateArr(arr, 0, arr.length-1);//5 4 3 2 1
        rotateArr(arr, 0, k-1);//4 3 2 1 5
        rotateArr(arr, k+1, arr.length-1);
        for(int i: arr){
            System.out.print(i+" ");
        }

    }
    static int[] rotateArr(int[] arr,int s,int e){
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        return arr;
    }
}
