// https://leetcode.com/problems/trapping-rain-water/

package Solutions;
public class TrapRainWater {
    public static void main(String[] args) {
        System.out.println(trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }
    public static int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int leftMax = height[left];
        int rightMax = height[right];
        int ans = 0;
        while(left<right){
            if(leftMax<=rightMax){
                left++;
                ans += leftMax-height[left]>0?leftMax-height[left]:0;
                leftMax = Math.max(leftMax, height[left]);
            }else{
                right--;
                ans+= rightMax-height[right]>0?rightMax-height[right]:0;
                rightMax = Math.max(rightMax, height[right]);
            }
        }

        return ans;
    }
}
