import java.util.List;

class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if(nums.size()==2 || k==1) return true;
        int g = 0;
        for(int s=0, e=s+k; s<(nums.size()-k-1); s++,e++){
            // System.out.print(nums.get(s)+":"+nums.get(s+1)+" -> "+nums.get(e)+":"+nums.get(e+1));
            if((nums.get(s+1)-nums.get(s)>=1) && (nums.get(e+1)-nums.get(e)>=1)) g++;
            else g=0;
            // System.out.println(" -> "+g);
            
            if(g==k-1) return true;
        }
        return false;
    }
}