class Solution {
    public int addDigits(int num) {
        while(num>9){
            int x=digits(num);
            num = x;
        }        
        return num;
    }
    public int digits(int num1){
        int sum=0;
        while(num1!=0){
            int r = num1%10;
            sum = sum + r;
            num1 = num1/10;            
        }
        return sum;
    }
}

// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
