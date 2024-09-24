class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        if(nums.length == 1){
            return nums[0];
        }

        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]==nums[i]){
                count++;
                max = Math.max(max, count);
            }else {
                count = 0;
            }
        }
        return nums[max];
    }
}
