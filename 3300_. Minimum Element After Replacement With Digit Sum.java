
import java.util.Arrays;

class Solution {
    public int minElement(int[] nums) {
        int min;
        
        int[] newnums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            newnums[i] = sum;
        }

        Arrays.sort(newnums);
        return newnums[0];
    }
}
