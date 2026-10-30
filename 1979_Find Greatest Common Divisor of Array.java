
class Solution {
    public int findGCD(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        // Find minimum and maximum
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Find GCD
        for (int i = min; i >= 1; i--) {

            if (min % i == 0 && max % i == 0) {
                return i;
            }
        }

        return 1;
    }
}

    

