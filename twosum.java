class TwoSum{
    public int[] twoSum(int[] nums, int target) {
    	
    	int[] sum = new int[2];
        int[] diff = new int[nums.length];
        for (int i=0; i < nums.length; i++){
            diff[i] = target - nums[i];
        }
        for (int i=0; i < nums.length; i++){
            for (int j=0; j < nums.length; j++){
                if (diff[i] + nums[j] == target){
                	sum[0] = diff[i];
                	sum[1] =nums[j]; 
                    break;
                }
                
        }
            
        }
        return sum;
    }
}
    
        
    
