class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fivedollar = 0;
        int tendollar = 0;
        int twentydollar = 0;        
        for(int i=0; i< bills.length; i++){
            if(bills[i] == 5){
                fivedollar++;
            }
            if(bills[i] == 10){
                tendollar++;
                if(fivedollar != 0){
                    fivedollar--;
                }else{
                    fivedollar--;
                    break;
                }
            }
            if(bills[i] == 20){
                twentydollar++;
                if(tendollar != 0 && fivedollar != 0){
                tendollar--;
                fivedollar--;
                } else if(fivedollar >= 3){
                    fivedollar -= 3;
                } else {
                    fivedollar -= 3;
                    break;
                }
            }
        }
        System.out.println(fivedollar);
        System.out.println(tendollar);
        System.out.println(twentydollar);
        if(fivedollar < 0 || tendollar <0 || twentydollar<0){
            return false;
        }
        return true;
    }
}

// not a good time complexity only a valid solution

// At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you and order one at a time (in the order specified by bills). Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill. You must provide the correct change to each customer so that the net transaction is that the customer pays $5.

// Note that you do not have any change in hand at first.

// Given an integer array bills where bills[i] is the bill the ith customer pays, return true if you can provide every customer with the correct change, or false otherwise.
