class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    // VS Code testing
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 2, 3};
        int k = 3;

        int result = solution.subarraySum(nums, k);
        System.out.println(result); // Output: 2
    }
}