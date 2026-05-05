public class Problem_two {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int k = 2;
        int n=arr.length;
        int mid = arr[n/2];
        int count = 0;

        for (int i = 0; i < n; i++) {
            int num = arr[i];

            int difference = Math.abs(num - mid);

            if (difference % k != 0) {
                System.out.println(-1);
                return;
            }
            count += difference / k;
        }
        System.out.println("Total Operations :"+count);
    }
}
