class Solution {
    public int[] productExceptSelf(int[] nums) {
      //Input: nums = [1,2,4,6]  
      //   doing with the suffix and prfix
      int []  result =new int [nums.length];
     result[0]=1;
        for(int i=1;i<nums.length;i++){
         result[i]=result[i-1]*nums[i-1];
        }
        int suffix=1;
        for(int j=nums.length-1;j>=0;j--){
        result[j]=suffix *  result[j];
        suffix=suffix * nums[j];
        }

      return result;
    }
}  
