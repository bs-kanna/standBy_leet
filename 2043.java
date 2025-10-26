class Bank {
    // //version: 1
    // int accountCount;
    // Map<Integer,Long> detail = new HashMap<>();
    // public Bank(long[] balance) {
    //     accountCount = balance.length;
    //     for(int i = 1; i < accountCount+1; i++){
    //         detail.put(i,balance[i-1]);
    //         // System.out.println(detail.get(i));
    //     }
    // }
    
    // public boolean transfer(int account1, int account2, long money) {
    //     if(account1 <= accountCount){
    //         Long current = detail.get(account1);
    //         if(current>= money
    //             && account2 <= accountCount){
    //                 detail.put(account1,current - money);
    //                 detail.put(account2,detail.get(account2) + money);
    //                 return true;
    //         }
    //     }
    //     return false;
    // }
    
    // public boolean deposit(int account, long money) {
    //     if(account <= accountCount){
    //         detail.put(account,detail.get(account) + money);
    //         return true;
    //     }
    //     return false;
    // }
    
    // public boolean withdraw(int account, long money) {
    //     if(account <= accountCount){
    //         long current = detail.get(account);
    //         if(current >= money){
    //             detail.put(account,current - money);
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    //version: 2
    int accountCount;
    long [] balance;
    public Bank(long[] balance) {
        accountCount = balance.length;
        this.balance = balance;
    }
    
    public boolean transfer(int account1, int account2, long money) {

        if(account1 > accountCount || account2 > accountCount) return false;
        if(withdraw(account1,money))
            return deposit(account2, money);
        return false;
    }
    
    public boolean deposit(int account, long money) {
        if(account > accountCount) return false;
        balance[account-1] += money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(account > accountCount || balance[account-1] < money) return false;
        balance[account-1] -= money;
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */