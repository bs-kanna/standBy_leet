class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //version: 1
        int n1=0, n2=0;
        int i1=0, i2=0;
        int l1=nums1.length, l2=nums2.length;
        int sumLen = l1+l2;
        int med1 = 0,med2 = 0;
        int mi1 = 0,mi2 = 0;
        int last;
        if((sumLen & 1) != 1){
            mi1 = (sumLen/2)-1; mi2 = sumLen/2;
        }else{
            mi1 = sumLen/2; mi2 = mi1;
        }
        // System.out.println("mi1-> "+mi1+", mi2-> "+mi2);
        // System.out.println("l1-> "+l1+", l2-> "+l2);
        while((i1+i2)<=mi2){
            boolean b1 = i1<l1;
            boolean b2 = i2<l2;
            // System.out.println("b1-> "+b1+", b2-> "+b2);
            if(b1) n1 = nums1[i1];
            if(b2) n2 = nums2[i2];
            // System.out.println("n1-> "+n1+", n2-> "+n2);
            // System.out.println("i1-> "+i1+", i2-> "+i2);
            if(b1 && b2){
                if(n1<n2){
                    last = n1;
                    i1++;
                    // System.out.println("n1-> "+n1);
                }else{
                    last = n2;
                    i2++;
                    // System.out.println("n2-> "+n2);
                }
            }else if(b1){
                    last = n1;
                    i1++;
                    // System.out.println("n1-> "+n1);
            }else{
                last = n2;
                i2++;
                // System.out.println("n2-> "+n2);
            }
            if((i1+i2-1)==mi1) med1 = last;
            if((i1+i2-1)==mi2) med2 = last;
        }
        // System.out.println("med1-> "+med1+", med2-> "+med2);
        return (med1+med2)/2.0;
    }
}