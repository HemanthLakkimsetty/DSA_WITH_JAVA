class P01LinearSearch {
    public static void main(String[] args) {
        int[] arr={10,25,7,42,18};
        int t=42;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t){
                System.out.println("Target found on idx :"+i);
            }
        }
    }
}
