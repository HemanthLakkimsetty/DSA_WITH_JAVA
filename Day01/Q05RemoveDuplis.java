import java.util.*;
import java.util.stream.Collectors;

public class Q5RemoveDuplis {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,4,4,5,5,6,6,7,7,8};
        //java 8 version
        HashSet<Integer>hs=Arrays.stream(arr).boxed().collect(Collectors.toCollection(HashSet::new));
        System.out.println(hs);

        //optional version
        HashSet<Integer>hs1=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs1.add(arr[i]);
        }
        System.out.println(hs1);
    }
}
