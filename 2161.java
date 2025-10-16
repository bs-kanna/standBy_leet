class Solution {
    // static {
    //     for (int i = 0; i < 300; i++) {
    //         pivotArray(new int[2],0);
    //     }
    // }
    // public static int[] pivotArray(int[] nums, int pivot) {
    public int[] pivotArray(int[] nums, int pivot) {
        //version: 1
        int [] res = new int [nums.length];
        int [] stack = new int [nums.length];
        int k = 0, count = 0;
        for(int i = 0, j = nums.length-1; i<nums.length; i++){
            int v = nums[i];
            if(v<pivot){ res[k] = v; k++;}
            else if(v>pivot){ stack[j] = v; j--;}
            else if(v==pivot) count++;
        }
        for(int x = 0;x<count;x++) {res[k] = pivot; k++;};
        int z = k;
        for(int i = nums.length-1;i>=z;i--){
            res[k] = stack[i];
            k++;
        }
        return res;

        // //version: 2
        // int [] res = new int [nums.length];
        // int k = 0, z = nums.length-1;
        // for(int i = 0,j = nums.length-1; i<nums.length; i++,j--){
        //     if(nums[i]<pivot) res[k++] = nums[i];
        //     if(nums[j]>pivot) res[z--] = nums[j]; 
        // }
        // while(k<=z) res[k++] = pivot;
        // return res;
    }
}