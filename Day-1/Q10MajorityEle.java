public class Q10MajorityEle {

    public static void main(String[] args) {

        int[] arr = {2,2,1,1,1,2,2};

        int Ele = 0;
        int cnt = 0;

        // Find candidate
        for (int i : arr) {

            if (cnt == 0) {
                Ele = i;
            }

            if (Ele == i) {
                cnt += 1;
            } else {
                cnt -= 1;
            }
        }

        // Verify candidate
        cnt = 0;

        for (int i : arr) {
            if (Ele == i) {
                cnt += 1;
            }
        }

        if (cnt > arr.length / 2) {
            System.out.println(Ele);
        } else {
            System.out.println("No majority element");
        }
    }
}