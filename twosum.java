class TwoSum {
        public int[] twoSum(int[] nums, int target) {
    	int[] sum = new int[2];
        Map<Integer, Integer> m = new HashMap();
        for (int i = 0; i<nums.length; i++){
            if (m.get(nums[i])!= null){
               sum = new int [] {m.get(nums[i]), i};
            }else{
                m.put(target - nums[i],i);
            }
}
return sum;
}
}
