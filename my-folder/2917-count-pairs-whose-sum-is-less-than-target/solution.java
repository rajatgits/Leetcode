class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;

        Collections.sort(nums);

        int i = 0;
        int j = nums.size()-1;

        while(i<j) {
            if(nums.get(i)+nums.get(j)<target){
                count+=j-i;
                i++;  
            }else {
                j--;
            } 
        }
        return count;
    }
}
