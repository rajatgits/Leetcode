class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int currentSum = 0;
        int i = 0;
        
        for(int j = 0; j<nums.length; j++) {
            currentSum += nums[j];

            while(currentSum >= target) {
                min = Math.min(min, j-i+1);
                currentSum -= nums[i];
                i++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
