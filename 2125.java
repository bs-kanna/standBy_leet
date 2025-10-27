class Solution {
    public int numberOfBeams(String[] bank) {
        int count =0;
        int lastCount = 0; 
        for(int k = 0; k<bank.length; k++){
            int currentCount = 0;
            for(char s : bank[k].toCharArray()) currentCount += (s - '0');
            if(currentCount == 0) continue;
            count = count + (currentCount * lastCount);
            lastCount = currentCount;
        }
        return count;
    }
}