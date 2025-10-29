import java.util.Arrays;

class Solution {
    public int countValidSelections(int[] nums) {
    //     //version: 1
    //     int count = 0;
    //     for(int i = 0; i<nums.length; i++){
    //         if(nums[i] == 0 && i>=0 && newRef(i,nums.clone(),false)) count++;
    //         if(nums[i] == 0 && i<nums.length && newRef(i,nums.clone(),true)) count++;
    //     }
    //     return count;
    // }

    // public boolean newRef(int i, int[] ref, boolean isLeft){
    //     // System.out.println(Arrays.toString(ref));
    //     // System.out.print("i- "+i+", "+isLeft);
    //     for(int j = i; (j>=0)&&(j<ref.length);){
    //         if(isLeft) j--;
    //         else j++;
    //         // System.out.print("\n"+j);
    //         if((j>=0)&&(j<ref.length)&&(ref[j]>0)){
    //             ref[j]--;
    //             isLeft = !isLeft;
    //             // System.out.print(", "+Arrays.toString(ref));
    //         }
            
    //     }
    //     int sum = 0;
    //     for(int k:ref){
    //         sum += k;
    //     }
    //     // System.out.println("\n"+Arrays.toString(ref)+"\n");
    //     return sum == 0;

        //version: 2
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                int [] ref = nums.clone();
                int len = ref.length-1;
                for(int l = i, r = i; ((l>0)||(r<len));){
                    if(l>0) ref[l-1] += ref[l--];
                    if(r<len) ref[r+1] += ref[r++];
                    // System.out.println(Arrays.toString(ref));
                }
                if(ref[0] == ref[len]) count += 2;
                else if(Math.abs(ref[0] - ref[len]) == 1) count++;
            }
        }
        return count;
    }
}