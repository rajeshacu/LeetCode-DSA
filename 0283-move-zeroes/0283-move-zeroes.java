class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length<2){
           System.out.println(Arrays.toString(nums));
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
            if(nums[j]==0){

                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
            }

            }
                       System.out.println(Arrays.toString(nums));

        }
        
    }
