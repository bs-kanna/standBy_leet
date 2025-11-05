class Solution {
    public int nextBeautifulNumber(int n) {
    //Version: 1
        while(true){
            if(isBalanced(++n)) return n;
        }
    }

    public boolean isBalanced(int d){
        int[] ref = new int [10];
        while(d>0){
            int rem = d%10;
            ref[rem]++;
            if(ref[rem]>rem || rem == 0) return false;
            d /= 10;
        }
        // System.out.println(Arrays.toString(ref));
        for(int r = 1; r<10; r++){
            if((ref[r]>0)&&(ref[r]<r)){ 
                // System.out.println(r+" -> "+ref[r]+"\n");
                return false;
            }
        }
        return true;
    }
}