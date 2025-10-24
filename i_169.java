import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        // //version: 1
        // int count = 0;
        // int temp = 0;
        // Arrays.sort(nums);
        // int last = nums[0];
        // int res = last;
        // for(int h = 0;h<nums.length;h++){
        //     if(last<nums[h]){
        //         count = (count>temp) ? count : temp;
        //         res = (count>temp) ? res : last;
        //         temp = 1;
        //         last = nums[h];
        //         // System.out.println("in");
        //     }else{
        //         temp++;
        //     }
        //     // System.out.println("last: "+last+", count: "+count+ ", temp: "+temp+ ", nums: "+nums[h]);
        // }
        // return (count>temp) ? res : last;

        // //version: 2
        // int max = 0;
        // int div = nums.length/2;
        // Map<Integer,Integer> reference = new HashMap<>();
        // for(int d = 0;d<nums.length;d++){
        //     int h = reference.getOrDefault(nums[d],0)+1;
        //     if(h>div) return nums[d];
        //     reference.put(nums[d],h);
        // }
        // return 0;

        // //version: 3
        // int temp = 0;
        // Arrays.sort(nums);
        // int last = nums[0];
        // int div = nums.length/2;
        // int h;
        // for(h = 0;h<nums.length/2+1;h++){
        //     if(last<nums[h]){
        //         temp = 1;
        //         // System.out.println();
        //         last = nums[h];
        //     }else{
        //         temp++;
        //         // System.out.println(temp+", "+div);
        //         if(div<temp) return last;
        //     }
        // }
        // return nums[h];

        // version: 4
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}