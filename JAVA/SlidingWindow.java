
class SlidingWindow {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 4;

        int sum = 0;

        
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxsum = sum;

        
        for (int right = k; right < arr.length; right++) {

            sum = sum - arr[right - k] + arr[right];

            if (sum > maxsum) {
                maxsum = sum;
            }
        }

        System.out.println("Maximum window sum: " + maxsum);
    }
}
