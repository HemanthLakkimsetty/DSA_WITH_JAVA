import java.util.ArrayList;

public class P05StoreAllOccur {
    public static void main(String[] args) {
        int[] arr={10, 20, 10, 30, 10, 40};
        int tar=10;

        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                al.add(i);
            }
        }
        System.out.println(al);
    }
    
}
