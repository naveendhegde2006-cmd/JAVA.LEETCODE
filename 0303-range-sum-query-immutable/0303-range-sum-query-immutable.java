class NumArray {
     int[] nums=new int[10000];
    public NumArray(int[] nums)
     {
         this.nums=nums;
    }
    
    public int sumRange(int left, int right)
     {
        int s=0;
        for(int i=left;i<=right;i++)
        s+=nums[i];
        return s;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */