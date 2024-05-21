package Solutions;
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum2 {
    public static void main(String args[]){
        System.out.print(twoSum(new int[] {2,7,11,15}, 9));
    }

    public static int[] twoSum(int[] numbers, int target){
        int i = 0;
        int j = numbers.length-1;
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum == target){
                return new int[] {i+1, j+1};
            }else if(sum < target){
                i++;
            }else{
                j--;
            }
        }

        return new int[] {};
    }
}
