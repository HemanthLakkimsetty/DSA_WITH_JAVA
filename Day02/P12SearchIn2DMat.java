public class P12SearchIn2DMat {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
//---------------Time Complexity is O(log(n x m))-----------//

        int t = 10;
        boolean found=false;
        int i=0;
        int j=arr.length*arr[0].length-1;

        while(i<=j){
            int mid=i+(j-i)/2;
            int row=mid/arr[0].length;
            int col=mid%arr[0].length;

            if(arr[row][col]==t){
                found=true;
                break;
            }else if(arr[row][col]<t){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        System.out.println(found);
//---------------Time Complexity is O(rows x log(n))-----------//
        for (int[] a : arr) {
            if (binarySearch(a, t)) {
                System.out.println("true");
                break;
            }
        }
    }

    static boolean binarySearch(int[] arr, int t) {
        int i = 0, j = arr.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] == t) {
                return true;
            } else if (arr[mid] < t) {
                i = mid + 1;       // search right
            } else {
                j = mid - 1;       // search left
            }
        }

        return false;
    }
}
