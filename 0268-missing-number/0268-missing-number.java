class Solution {
    public int missingNumber(int[] nums) {
        int mis;
        int n=nums.length;
        int actual=0;
        int expected=n*(n+1)/2;
       for(int arr:nums){

        actual+=arr;
       }
       

       mis=expected -actual;


        return mis;
        
    }
}