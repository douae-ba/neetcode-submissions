class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] nombres = new int[nums.length];
        int prod=1;
        int zero=0;
        for(int n: nums){
            if(n!=0){
                prod*=n;
            } else {
                zero++;
            }
        }
        if (zero> 1) {
            return new int[nums.length];
        }
        if(zero>0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0)
                nombres[i]=0;
                else{
                    nombres[i]=prod;
                }
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                nombres[i]=prod/nums[i];
                
            }
        }
        return nombres;
    }
}  
