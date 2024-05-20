//https://leetcode.com/problems/container-with-most-water/submissions/1263032962/
public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }

    public static  int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = Integer.MIN_VALUE;
        while(left<right){

            int currArea = height[left]<height[right]? (right-left)*height[left]:(right-left)*height[right];
            maxArea = Math.max(currArea,maxArea);
            int h = Math.min(height[left], height[right]);
            while(left<right && height[left]<=h){
                left++;
            }
            while(left<right && height[right]<=h){
                right--;
            }
        }

        return maxArea;
    }
}
