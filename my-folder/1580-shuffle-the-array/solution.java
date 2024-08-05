class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int[] arr1 = Arrays.copyOfRange(nums, 0, nums.length/2);
        int[] arr2 = Arrays.copyOfRange(nums, nums.length/2, nums.length);

        for(int i=0; i<nums.length/2; i++) {
            arr[2*i] = arr1[i];
            arr[2*i+1] = arr2[i];
        }
        return arr;
    }
}
