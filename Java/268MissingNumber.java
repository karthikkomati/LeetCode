class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int n: nums){
            sum = sum+n;
        }
        int x = nums.length;
        return ((x*(x+1))/2) - sum;
    }
}
