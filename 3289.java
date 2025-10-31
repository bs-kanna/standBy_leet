class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int [] ref = new int[nums.length];
        int [] count = new int[2];
        int i=0;
        for(int g : nums){
            ref[g]++;
            if(ref[g]>1) count[i++] = g;
        } 
        return count;
    }
}