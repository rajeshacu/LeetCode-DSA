class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        for(int n:nums){
            set.add(n);

        }
        List<Integer> list=new ArrayList<Integer>(set);
        Collections.sort(list,Collections.reverseOrder());
        if(list.size()<3){

            return list.get(0);
        }
        return list.get(2);

    }
}