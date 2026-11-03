class Solution {
    public int minMoves(int[] nums) {
        int moves = 0;
        int max = nums[0];

        // Find maximum element
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        // Calculate required moves
        for (int i = 0; i < nums.length; i++) {
            moves += max - nums[i];
        }

        return moves;
    }
}