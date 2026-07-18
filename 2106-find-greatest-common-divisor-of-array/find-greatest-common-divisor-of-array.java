import java.math.BigInteger;
class Solution {
        public static int findGCD(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return findGCD(b, a % b);
    }
    public int findGCD(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return findGCD(nums[0],nums[n-1]);
    }
}