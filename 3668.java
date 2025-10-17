class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        // //version: 1
        // Set<Integer> set = new HashSet<>();
        // for(int f : friends) set.add(f);
        // for(int a = 0,b = 0;a<order.length;a++){
        //     int d = order[a];
        //     if(set.contains(d)){
        //         friends[b++] = d;
        //     }
        // }
        // return friends;

        //version: 2
        int [] re = new int[order.length];
        for(int d = 0;d<order.length;d++) {
            int a = order[d];
            re[a-1] = d+1;
        }
        // System.out.println(Arrays.toString(re));
        order = new int[order.length];
        // System.out.println(Arrays.toString(order));
        for(int d = 0;d<friends.length;d++) {
            int g = friends[d];
            order[re[g-1]-1] = g;
        }
        // System.out.println(Arrays.toString(order));
        for(int d = 0,e = 0;d<order.length;d++){
            int f = order[d];
            if(f>0) friends[e++] = f;
        }
        // System.out.println(Arrays.toString(friends));
        return friends;
    }
}