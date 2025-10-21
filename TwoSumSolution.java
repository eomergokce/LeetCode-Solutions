class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {

        int size = nums.length;
        int num1=0;
        int num2=0;
        int result[] = new int[2];

        loop:
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(nums[i]+nums[j] == target){
                    result[0]=i;
                    result[1]=j;
                    break loop;
                }
            }
        }
        return result;
    }
}