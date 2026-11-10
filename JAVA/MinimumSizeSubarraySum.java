
public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            // Expand the window
            sum += nums[right];

            // Shrink the window while sum >= target
            while (sum >= target) {

                int currentLength = right - left + 1;

                minLength = Math.min(minLength, currentLength);

                sum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {

        MinimumSizeSubarraySum solution =
                new MinimumSizeSubarraySum();

        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        System.out.println(solution.minSubArrayLen(target, nums));
        // Output: 2
    }
}
