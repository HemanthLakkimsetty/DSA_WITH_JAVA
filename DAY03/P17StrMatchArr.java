public class P17StrMatchArr {
    public static void main(String[] args) {
        String[] arr={"mass","as","hero","superhero"};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i].contains(arr[j])){
                    System.out.println(arr[j]);
                }
            }
        }
    }
    
}
