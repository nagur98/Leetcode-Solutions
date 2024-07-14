class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] du=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    du[0]=i;
                    du[1]=j;
                    break;
                }
            }
        }
            return du;
    }
}