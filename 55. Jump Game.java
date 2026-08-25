class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // If current index is beyond the maximum index reachable, we can't proceed
            if (i > maxReach) {
                return false;
            }
            
            // Update the maximum reachable index from current position
            maxReach = Math.max(maxReach, i + nums[i]);
            
            // Optimization: if we can already reach or pass the last index
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        
        return true;
    }
}
